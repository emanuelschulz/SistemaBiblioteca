package Control;

import Model.Editora;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ferre
 */
public class ControleEditora {

    public boolean GravarEditora(Editora editora) {
        if (editora.getId() > 0) {
            return alterarEditora(editora);
        } else {
            return inserirEditora(editora);
        }
    }

    private boolean alterarEditora(Editora editora) {
        String sql = "update editora set  nome=?,logradouro=?,telefone=?,site=?,status=? where id=?";

        try {
            PreparedStatement comando = DB.connection().prepareStatement(sql);

            comando.setString(1, editora.getNome());
            comando.setString(2, editora.getLogradouro());
            comando.setString(3, editora.getTelefone());
            comando.setString(4, editora.getSite());
            comando.setBoolean(5, editora.isStatus());
            comando.setInt(6, editora.getId());

            comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;

        }
    }

    public boolean inserirEditora(Editora editora) {
        String sql = "insert into editora (nome,logradouro,telefone,site,status)"
                + "values (?,?,?,?,?); ";
        try {
            PreparedStatement comando = DB.connection().prepareStatement(sql);
            comando.setString(1, editora.getNome());
            comando.setString(2, editora.getLogradouro());
            comando.setString(3, editora.getTelefone());
            comando.setString(4, editora.getSite());
            comando.setBoolean(5, editora.isStatus());

            comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public ArrayList<Editora> pesquisarEditora(String filtro) {

        ArrayList<Editora> listaEditora = new ArrayList<>();
        String sql = "select * from editora where status = 1 and trim(lower(nome)) like ? order by id_editora";

        try {
            PreparedStatement consulta = DB.connection().prepareStatement(sql);
            consulta.setString(1, "%" + filtro.toLowerCase().trim() + "%");
            ResultSet resultado = consulta.executeQuery();

            while (resultado.next()) {
                Editora editora = new Editora(resultado.getInt("id"),
                        resultado.getString("nome"),
                        resultado.getString("logradouro"),
                        resultado.getString("telefone"),
                        resultado.getString("site"),
                        resultado.getBoolean("status"));

                listaEditora.add(editora);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return listaEditora;
    }

    public boolean excluirEditora(Editora editora) {
        editora.setStatus(false);
        return alterarEditora(editora);
    }

    public ArrayList<Editora> listarEditora() {

        String sql = "select * from editora;";
        ArrayList<Editora> lista = new ArrayList<>();

        try {
            PreparedStatement consulta = DB.connection().prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();

            while (resultado.next()) {
                Editora editora = new Editora(resultado.getInt("id"),
                        resultado.getString("nome"),
                        resultado.getString("logradouro"),
                        resultado.getString("telefone"),
                        resultado.getString("site"),
                        resultado.getBoolean("status"));

                lista.add(editora);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return lista;

    }
}
