/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MDI
 */
public class DBConnection {
    private static final String DRIVER = "org.sqlite.JDBC";
    private static final String URL = "jdbc:sqlite:duo.s3db";
    
    public static Connection openConnection() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL);
        }
        catch (ClassNotFoundException | SQLException exception) {
            throw new RuntimeException("Erro na conexão", exception);
        }
    }
    
    public static void closeConnection(Connection connection) {
        if(connection != null) {
            try {
                connection.close();
            } catch (SQLException exception) {
                Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, exception);
            }
        }
    }
    
    public static void closeConnection(Connection connection, PreparedStatement statement) {
        closeConnection(connection);
        if(statement != null) {
            try {
                statement.close();
            } catch (SQLException exception) {
                Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, exception);
            }
        }
    }
}
