package Control;

import Model.Autor;
import java.sql.Date;
import java.sql.PreparedStatement;

public class ControleAutor {
    public void cadastrarAutor(Autor a) {
        String sql ="insert into autor (nome, anoNasc, status) values(?,?,?)";
        try {
            PreparedStatement comando = Conexao.getConexao().prepareStatement(sql);
            comando.setString(1, a.getNome());
            comando.setDate(2, (Date) a.getAno_nasc());
            comando.setBoolean(3, true);
            comando.executeUpdate();
        } catch (Exception e) {
            System.out.println("deu erro"); 
        }
        
    }
}
