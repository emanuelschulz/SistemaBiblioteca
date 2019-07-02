package Control;

import java.sql.PreparedStatement;
import Model.Usuario;
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

    public boolean GravarUsuario(Usuario usuario) {
        if (usuario.getId() > 0) {
            return alterarUsuario(usuario);
        } else {
            return inserirUsuario(usuario);
        }
    }

    private boolean alterarUsuario(Usuario usuario) {
        String sql = "UPDATE Usuarios SET nome=?,dataNasc=?,cpf=?,email=?,senha=?,status=?,suspensoAte=?,codigoUsuario=?,tipo=?,logradouro=? WHERE id=?;";

        try {
            PreparedStatement comando = conexao.prepareStatement(sql);

            comando.setString(1, usuario.getNome());
            comando.setDate(2, (Date) usuario.getDataNasc());
            comando.setString(3, usuario.getCpf());
            comando.setString(4, usuario.getEmail());
            comando.setString(5, usuario.getSenha());
            comando.setBoolean(6, usuario.isStatus());
            comando.setDate(7, (Date) usuario.getSuspensoAte());
            comando.setString(8, usuario.getCodigoUsuario());
            comando.setString(9, usuario.getTipo());
            comando.setString(10, usuario.getLogradouro());
            comando.setInt(11, usuario.getId());

            comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;

        }
    }

    public boolean inserirUsuario(Usuario usuario) {
        String sql = "INSERT INTO Usuarios(nome,dataNasc,cpf,email,senha,status,suspensoAte,codigoUsuario,tipo,logradouro)"
                + "values (?,?,?,?,?,?,?,?,?,?);";
        try {
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setString(1, usuario.getNome());
            comando.setDate(2, (Date) usuario.getDataNasc());
            comando.setString(3, usuario.getCpf());
            comando.setString(4, usuario.getEmail());
            comando.setString(5, usuario.getSenha());
            comando.setBoolean(6, usuario.isStatus());
            comando.setDate(7, (Date) usuario.getSuspensoAte());
            comando.setString(8, usuario.getCodigoUsuario());
            comando.setString(9, usuario.getTipo());
            comando.setString(10, usuario.getLogradouro());

            comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public ArrayList<Usuario> pesquisarUsuario(String filtro) {

        ArrayList<Usuario> listaUsuario = new ArrayList<>();
        String sql = "select * from usuario where status = 1 and trim(lower(nome)) like ? order by id";

        try {
            PreparedStatement consulta = conexao.prepareStatement(sql);
            consulta.setString(1, "%" + filtro.toLowerCase().trim() + "%");
            ResultSet resultado = consulta.executeQuery();

            while (resultado.next()) {
                //id,nome,dataNasc,cpf,email,senha,suspensoAte,codigoUsuario,tipo,logradouro,status

                Usuario usuario = new Usuario(resultado.getInt("id"),
                        resultado.getString("nome"),
                        resultado.getDate("dataNasc"),
                        resultado.getString("cpf"),
                        resultado.getString("email"),
                        resultado.getString("senha"),
                        resultado.getDate("suspensoAte"),
                        resultado.getString("codigoUsuario"),
                        resultado.getString("tipo"),
                        resultado.getString("logradouro"),
                        resultado.getBoolean("status"));
                
                listaUsuario.add(usuario);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return listaUsuario;
    }

    public boolean excluirUsuario(Usuario usuario) {
        usuario.setStatus(false);
        return alterarUsuario(usuario);
    }

    public ArrayList<Usuario> listarModelo() {

        String sql = "select * from usuario;";
        ArrayList<Usuario> listaUsuario = new ArrayList<>();

        try {
            PreparedStatement consulta = conexao.prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();

            while (resultado.next()) {

                Usuario usuario = new Usuario(resultado.getInt("id"),
                        resultado.getString("nome"),
                        resultado.getDate("dataNasc"),
                        resultado.getString("cpf"),
                        resultado.getString("email"),
                        resultado.getString("senha"),
                        resultado.getDate("suspensoAte"),
                        resultado.getString("codigoUsuario"),
                        resultado.getString("tipo"),
                        resultado.getString("logradouro"),
                        resultado.getBoolean("status"));
                listaUsuario.add(usuario);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return listaUsuario;

    }
}
