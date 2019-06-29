
package Control;

import Model.AutorModelo;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ControleAutor {

    private  Connection conexao = DB.connection();

    public boolean gravarAutor(AutorModelo autor) {
        if (autor.getId_autor() > 0) {
            return alterarAutor(autor);
        } else {
            return inserirAutor(autor);
        }
    }

    private boolean alterarAutor(AutorModelo autor) {
        String sql = "update autor set  nome= ?,anoNasc=?,status= ? where id = ?";

        try {
            PreparedStatement comando = conexao.prepareStatement(sql);

            comando.setString(1, autor.getNome());
            comando.setDate(2, (Date) autor.getAnoNasc());
            comando.setBoolean(3, autor.isStatus());

            comando.executeUpdate();

            return true;

        } catch (SQLException ex) {
            ex.printStackTrace();

            return false;
        }
    }

    public boolean inserirAutor(AutorModelo autor) {
        String sql = "insert into autor (nome,anoNasc,status)"
                + "values (?,?,?); ";
        try {
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setString(1, autor.getNome());
            comando.setDate(2, (Date) autor.getAnoNasc());
            comando.setBoolean(3, autor.isStatus());

            comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public ArrayList<AutorModelo> pesquisarAutor(String filtro) {

        ArrayList<AutorModelo> listaAutor = new ArrayList<>();
        String sql = "select * from autor where status = 1 and trim(lower(nome)) like ? order by id";

        try {
            PreparedStatement consulta = conexao.prepareStatement(sql);
            consulta.setString(1, "%" + filtro.toLowerCase().trim() + "%");
            ResultSet resultado = consulta.executeQuery();

            while (resultado.next()) {

                AutorModelo autor = new AutorModelo();

                autor.setId_autor(resultado.getInt("id"));
                autor.setNome(resultado.getString("nome"));
                autor.setAno_nasc(resultado.getDate("anoNasc"));

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return listaAutor;
    }

    public boolean excluirAutor(AutorModelo autor) {
        autor.setStatus(false);
        return alterarAutor(autor);
    }

    public ArrayList<AutorModelo> listarAutor() {

        String sql = "select id, nome, anaNasc from autor;";
        ArrayList<AutorModelo> autor = new ArrayList<>();

        try {
            PreparedStatement consulta = conexao.prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();

            while (resultado.next()) {

                AutorModelo autor = new AutorModelo();

                autor.setId_autor(resultado.getInt("id"));
                autor.setNome(resultado.getString("nome"));
                autor.setAno_nasc(resultado.getDate("anoNasc"));

                autor.add(autor);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return autor;

    }
}
