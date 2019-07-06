/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Emprestimo;
import Model.Livro;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author rafas
 */
public class ControleEmprestimo {

    public boolean EmprestarLivro(Emprestimo emprestimo, Livro[] livros) {                
        String sql = "INSERT INTO Emprestimo (dataEmprestimo, dataDevolucao, Usuarios_id, status) VALUES (?,?,?,?);";
        try {
            PreparedStatement comando = DB.connection().prepareStatement(sql);
            comando.setDate(1, (Date) emprestimo.getEmprestimo());
            comando.setDate(2, (Date) emprestimo.getDevolucao());
            comando.setInt(3, emprestimo.getId_usuario());
            comando.setBoolean(4, true);
            
            comando.executeUpdate();
            
            cadastrarNN(livros);
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    private void cadastrarNN(Livro[] livros) {
        String sql = "INSERT INTO livro_has_Emprestimo (livro_id,Emprestimo_id) VALUES (?, (select max(id) from Emprestimo));";

        for (Livro livro : livros) {
            try {
                PreparedStatement comando = DB.connection().prepareStatement(sql);
                comando.setInt(1, livro.getId_livro());

                comando.executeUpdate();
            } catch (Exception e) {
                System.out.println("deu erro " + this.getClass().getName() + ".cadastrarNN()");
                e.printStackTrace();
            }
        }
    }
    
    
}
