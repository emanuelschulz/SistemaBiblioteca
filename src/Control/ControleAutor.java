
package Control;

import Model.Autor;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ControleAutor {

    public boolean gravarAutor(Autor autor) {
        if (autor.getId_autor() > 0) {
            return alterarAutor(autor);
        } else {
            return inserirAutor(autor);
        }
    }

    private boolean alterarAutor(Autor autor) {
        String sql = "update autor set  nome= ?,anoNasc=?,status= ? where id = ?";

        try {
            PreparedStatement comando = DB.connection().prepareStatement(sql);

            comando.setString(1, autor.getNome());
            comando.setString(2, autor.getAnoNasc());
            comando.setBoolean(3, autor.isStatus());

            comando.executeUpdate();

            return true;

        } catch (SQLException ex) {
            ex.printStackTrace();

            return false;
        }
    }

    public boolean inserirAutor(Autor autor) {
        String sql = "insert into autor (nome,anoNasc,status)"
                + "values (?,?,?); ";
        try {
            PreparedStatement comando = DB.connection().prepareStatement(sql);
            comando.setString(1, autor.getNome());
            comando.setString(2, autor.getAnoNasc());
            comando.setBoolean(3, autor.isStatus());

            comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public ArrayList<Autor> pesquisarAutor(String filtro) {

        ArrayList<Autor> listaAutor = new ArrayList<>();
        String sql = "select * from autor where status = 1 and trim(lower(nome)) like ? order by id";

        try {
            PreparedStatement consulta = DB.connection().prepareStatement(sql);
            consulta.setString(1, "%" + filtro.toLowerCase().trim() + "%");
            ResultSet resultado = consulta.executeQuery();

            while (resultado.next()) {

                Autor autor = new Autor();

                autor.setId_autor(resultado.getInt("id"));
                autor.setNome(resultado.getString("nome"));
                autor.setAno_nasc(resultado.getString("anoNasc"));

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return listaAutor;
    }

    public boolean excluirAutor(Autor autor) {
        autor.setStatus(false);
        return alterarAutor(autor);
    }

    public ArrayList<Autor> listarAutor() {

        String sql = "select id, nome, anoNasc, status from Autor;";
        ArrayList<Autor> lista = new ArrayList<>();

        try {
            PreparedStatement consulta = DB.connection().prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();

            while (resultado.next()) {

                Autor autor = new Autor();

                autor.setId_autor(resultado.getInt("id"));
                autor.setNome(resultado.getString("nome"));
                autor.setAno_nasc(resultado.getString("anoNasc"));
                autor.setStatus(resultado.getBoolean("status"));
                
                lista.add(autor);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return lista;

    }
}
