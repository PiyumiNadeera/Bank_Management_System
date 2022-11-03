/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Piyumi
 */
public class dbConfig {

    private static String serverName = "localhost";
    private static String userName = "root";
    private static String password = "";
    private static String dbName = "bank";
    private static Integer port = 3307;

    public static Connection getConnection() {

        Connection con = null;

        MysqlDataSource dataSource = new MysqlDataSource();

        dataSource.setServerName(serverName);
        dataSource.setUser(userName);
        dataSource.setPassword(password);
        dataSource.setDatabaseName(dbName);
        dataSource.setPortNumber(port);

        try {

            con = dataSource.getConnection();
            System.out.println("Connection Success");
            return con;

        } catch (SQLException ex) {
            System.out.println("COnnection Error");
            JOptionPane.showMessageDialog(null, "Connection Error", "Error", 2);
            Logger.getLogger("Get Connection", dbConfig.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    } 





}
