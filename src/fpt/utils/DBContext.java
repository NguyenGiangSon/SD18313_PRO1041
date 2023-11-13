package fpt.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBContext {
    
    public static final String USERNAME = "sa";
    public static final String PASSWORD = "22122002";
    public static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=SD18313_PRO1041;encrypt=true;trustServerCertificate=true;";

    static {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static void main(String[] args) {
        Connection connection = getConnection();
        if (connection != null) {
            System.out.println("Ket noi thanh cong");
        } else {
            System.out.println("Ket noi khong thanh cong");
        }
    }
}
