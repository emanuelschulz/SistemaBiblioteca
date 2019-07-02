/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Emprestimo;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author rafas
 */
public class EmprestimoControle {

    public boolean EmprestarLivro(Emprestimo emprestimo) {
        String sql = "insert into livro_has_emprestimo (livro_id)"
                + "values (?); ";
        try {
            PreparedStatement comando = DB.connection().prepareStatement(sql);
            comando.setInt(1, emprestimo.getId_livro());

            comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public boolean Emprestimo(Emprestimo emprestimo) {
        String sql = "insert into emprestimo (dataEmprestimo,dataDevolucao)"
                + "values (?); ";
        try {
            PreparedStatement comando = DB.connection().prepareStatement(sql);
            comando.setInt(1, emprestimo.getId_livro());
            comando.setDate(2, (Date) usuario.getData_nasc());

            comando.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
