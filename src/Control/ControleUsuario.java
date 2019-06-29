package Control;

import java.sql.PreparedStatement;
import Model.UsuarioModelo;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ControleUsuario {

    private Connection conexao;

    public ControleUsuario() throws SQLException {
        this.conexao = DB.connection();
    }

    public boolean GravarEditora(UsuarioModelo usuario) {
        if (usuario.getId_usuario() > 0) {
            return alterarUsuario(usuario);
        } else {
            return inserirUsuario(usuario);
        }
    }

    private boolean alterarUsuario(UsuarioModelo usuario) {
        String sql = "update usuario set  nome= ?, email=?, tipo_usuario= ?, cpf= ?,telefone= ?, data_nasc= ?, endereco = ?, suspencao = ?, status = ?, senha = ?  where id_usuario = ?";

        try {
            PreparedStatement comando = conexao.prepareStatement(sql);

            comando.setString(1, usuario.getNome());
            comando.setString(2, usuario.getEmail());
            comando.setString(3, usuario.getTipo_usuario());
            comando.setString(4, usuario.getCpf());
            comando.setString(5, usuario.getTelefone());
            comando.setDate(6, (Date) usuario.getData_nasc());
            comando.setString(7, usuario.getEndereco());
            comando.setDate(8, (Date) usuario.getSuspencao());
            comando.setBoolean(9, usuario.isStatus());
            comando.setString(10, usuario.getSenha());

            comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;

        }
    }

    public boolean inserirUsuario(UsuarioModelo usuario) {
        String sql = "insert into usuario (nome,lougradouro,telefone,site,ano_da_edicao,status)"
                + "values (?,?,?,?,?,?); ";
        try {
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setString(1, usuario.getNome());
            comando.setString(2, usuario.getEmail());
            comando.setString(3, usuario.getTipo_usuario());
            comando.setString(4, usuario.getCpf());
            comando.setString(5, usuario.getTelefone());
            comando.setDate(6, (Date) usuario.getData_nasc());
            comando.setString(7, usuario.getEndereco());
            comando.setDate(8, (Date) usuario.getSuspencao());
            comando.setBoolean(9, usuario.isStatus());
            comando.setString(10, usuario.getSenha());

            comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public ArrayList<UsuarioModelo> pesquisarEditora(String filtro) {

        ArrayList<UsuarioModelo> listaEditora = new ArrayList<>();
        String sql = "select id_usuario, nome, lougradouro,telefone,site,ano_da_edicao from usuario where status = 1 and trim(lower(nome)) like ? order by id_usuario";

        try {
            PreparedStatement consulta = conexao.prepareStatement(sql);
            consulta.setString(1, "%" + filtro.toLowerCase().trim() + "%");
            ResultSet resultado = consulta.executeQuery();

            while (resultado.next()) {

                UsuarioModelo usuario = new UsuarioModelo();

                usuario.setId_usuario(resultado.getInt("id_usuario"));
                usuario.setNome(resultado.getString("nome"));
                usuario.setLougradouro(resultado.getString("lougradouro"));
                usuario.setTelefone(resultado.getString("telefone"));
                usuario.setSite(resultado.getString("site"));
                usuario.setAno_da_edicao(resultado.getString("ano_de_edicao"));

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return listaEditora;
    }

    public boolean excluirEditora(UsuarioModelo usuario) {
        usuario.setStatus(false);
        return alterarUsuario(usuario);
    }

    public ArrayList<UsuarioModelo> listarModelo() {

        String sql = "select id_usuario, nome, lougradouro,telefone, site, ano_da_edicao from usuario;";
        ArrayList<UsuarioModelo> usuario = new ArrayList<>();

        try {
            PreparedStatement consulta = conexao.prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();

            while (resultado.next()) {

                UsuarioModelo usuarioo = new UsuarioModelo();

                usuarioo.setId_usuario(resultado.getInt("Id_usuario"));
                usuarioo.setNome(resultado.getString("nome"));
                usuarioo.setLougradouro(resultado.getString("lougradouro"));
                usuarioo.setTelefone(resultado.getString("telefone"));
                usuarioo.setSite(resultado.getString("site"));
                usuarioo.setAno_da_edicao(resultado.getString("ano_da_edicao"));

            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return usuario;

    }
}
