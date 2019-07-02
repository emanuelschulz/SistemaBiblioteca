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
public class EditoraControle {

    private final Connection conexao;

    public EditoraControle() throws SQLException {
        this.conexao = DB.connection();
    }

    public boolean GravarEditora(Editora editora) {
        if (editora.getId_editora() > 0) {
            return alterarEditora(editora);
        } else {
            return inserirEditora(editora);
        }
    }

    private boolean alterarEditora(Editora editora) {
        String sql = "update editora set  nome= ?,lougradouro=?,telefone= ?,site= ?,ano_da_edicao= ?,status= ? where id_editora = ?";

        try {
            PreparedStatement comando = conexao.prepareStatement(sql);

            comando.setString(1, editora.getNome());
            comando.setString(2, editora.getLougradouro());
            comando.setString(3, editora.getTelefone());
            comando.setString(4, editora.getSite());
            comando.setString(5, editora.getAno_da_edicao());
            comando.setBoolean(6, editora.isStatus());

            comando.executeUpdate();
return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;

        }
    }

    public boolean inserirEditora(Editora editora) {
        String sql = "insert into editora (nome,lougradouro,telefone,site,ano_da_edicao,status)"
                + "values (?,?,?,?,?,?); ";
        try {
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setString(1, editora.getNome());
            comando.setString(2, editora.getLougradouro());
            comando.setString(3, editora.getTelefone());
            comando.setString(4, editora.getSite());
            comando.setString(5, editora.getAno_da_edicao());
            comando.setBoolean(6, editora.isStatus());

            comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public ArrayList<Editora> pesquisarEditora(String filtro) {

        ArrayList<Editora> listaEditora = new ArrayList<>();
        String sql = "select id_editora, nome, lougradouro,telefone,site,ano_da_edicao from editora where status = 1 and trim(lower(nome)) like ? order by id_editora";

        try {
            PreparedStatement consulta = conexao.prepareStatement(sql);
            consulta.setString(1, "%" + filtro.toLowerCase().trim() + "%");
            ResultSet resultado = consulta.executeQuery();

            while (resultado.next()) {

                Editora editora = new Editora();

                editora.setId_editora(resultado.getInt("id_editora"));
                editora.setNome(resultado.getString("nome"));
                editora.setLougradouro(resultado.getString("lougradouro"));
                editora.setTelefone(resultado.getString("telefone"));
                editora.setSite(resultado.getString("site"));
                editora.setAno_da_edicao(resultado.getString("ano_de_edicao"));

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

    public ArrayList<Editora> listarModelo() {

        String sql = "select id_editora, nome, lougradouro,telefone, site, ano_da_edicao from editora;";
        ArrayList<Editora> editora = new ArrayList<>();

        try {
            PreparedStatement consulta = conexao.prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();

            while (resultado.next()) {

                Editora editorra = new Editora();

                editorra.setId_editora(resultado.getInt("Id_editora"));
                editorra.setNome(resultado.getString("nome"));
               editorra.setLougradouro(resultado.getString("lougradouro"));
                editorra.setTelefone(resultado.getString("telefone"));
                editorra.setSite(resultado.getString("site"));
                editorra.setAno_da_edicao(resultado.getString("ano_da_edicao"));

            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return editora;

    }
}
