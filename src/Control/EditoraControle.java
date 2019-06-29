package Control;

import Model.EditoraModelo;
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

    private Connection conexao = Conexao.getConexao();

    
    
 
    
    public void GravarEditora(EditoraModelo editora) {
        if (editora.getId_editora() > 0) {
            return alterarEditora(editora);
        } else {
            return inserirEditora(editora);
        }
    }

    private void alterarEditora(EditoraModelo editora) {
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

        } catch (SQLException ex) {
            ex.printStackTrace();

        }
    }

    public void inserirEditora(EditoraModelo editora) {
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
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<EditoraModelo> pesquisarEditora(String filtro) {

        ArrayList<EditoraModelo> listaEditora = new ArrayList<>();
        String sql = "select id_produtos, nome, lougradouro,telefone,site,ano_da_edicao from editora where status = 1 and trim(lower(nome)) like ? order by id_editora";

        try {
            PreparedStatement consulta = conexao.prepareStatement(sql);
            consulta.setString(1, "%" + filtro.toLowerCase().trim() + "%");
            ResultSet resultado = consulta.executeQuery();

            while (resultado.next()) {

EditoraModelo editora = new EditoraModelo();

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

    public void excluirEditora(EditoraModelo editora) {
        editora.setStatus(false);
        return alterarEditora(editora);
    }

    public ArrayList<Produto> listarProduto() {

        String sql = "select id_produtos, nome, descricao, quantidade, unidade, preco from produto;";
        ArrayList<Produto> produtos = new ArrayList<>();

        try {
            PreparedStatement consulta = conexao.prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();

            while (resultado.next()) {

                Produto produto = new Produto();

                produto.setId_produtos(resultado.getInt("id_produtos"));
                produto.setNome(resultado.getString("nome"));
                produto.setDescricao(resultado.getString("descricao"));
                produto.setQuantidade(resultado.getInt("quantidade"));
                produto.setUnidade(resultado.getString("unidade"));
                produto.setPreco(resultado.getFloat("preco"));

                produtos.add(produto);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return produtos;

    }
}
