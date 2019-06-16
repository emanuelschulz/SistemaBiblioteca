/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.sql.*;

/**
 *
 * @author Rafael
 */
public class Conexao {

    private static Connection conexao;

    public static Connection getConexao() throws SQLException {
        if (conexao == null) {
            conexao = DriverManager.getConnection("jdbc:mysql://srv02.hostoo.io:3306/poo1?serverTimezone=UTC&autoReconnect=true&useSSL=false", "dbbiblio", "rFME8SpU_CaQ*pJG");
        }
        return conexao;
    }

}
