package Control;

import java.sql.PreparedStatement;
import Model.Usuario;
import java.sql.Date;

//Ta errado
public class ControleUsuario {
    public boolean cadastrarUsuario(Usuario usuario){
        String sql = "insert into Usuarios"
                +"(nome, dataNasc, cpf, email, senha)"
                +"values "
                +"(?, ?, ?, ?, ?);";
        
        try {
            PreparedStatement comando = DB.connection().prepareStatement(sql);
            comando.setString(1, usuario.getNome());
            comando.setDate(2, (Date) usuario.getData_nasc());
            comando.setString(3, usuario.getCpf());
            comando.setString(4, usuario.getEmail());
            comando.setString(5, usuario.getSenha());
            comando.executeUpdate();
            
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
