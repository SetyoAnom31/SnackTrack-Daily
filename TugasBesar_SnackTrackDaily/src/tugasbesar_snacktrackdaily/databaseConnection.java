/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasbesar_snacktrackdaily;

/**
 *
 * @author Anom
 */
import java.sql.*;

public class databaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/snacktrack";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
