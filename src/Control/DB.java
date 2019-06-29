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
public class DB {

    private static Connection connect;

    public static Connection connection() throws SQLException {
        if (connect == null) {
            connect = DriverManager.getConnection("jdbc:mysql://srv02.hostoo.io:3306/poo1?serverTimezone=UTC&autoReconnect=true&useSSL=false", "dbbiblio", "brQDSbQZ-hU4Vu@w");
        }
        return connect;
    }
    
//    public static boolean execute(String sql) throws SQLException {
//        Connection connection = this.connection();
//        thi
//        try {
//            PreparedStatement stmt = this.connect.prepareStatement(sql);
//        } catch (Exception e) {}
//    }
//    
//    public static Object select(String sql) {
//     Object result = "";
//     
//     return result;
//    }

}
