/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.*;
/**
 *
 * @author Lab Informatika
 */
public class Connector {
    private static string jdbc_driver = "com.mysql.cj.jdbc.Driver";
    private static string nama_db = "employee_db";
    private static string url_db = "jdbc:mysql://localhost:3306/" + nama_db;
    private static string username_db = "root";
    private static string password_db = "";
    
    static Connection conn;
    
    public static Connection Connect (){
        try {
            Class.forName(jdbc_driver);
            conn = DriverManager.getConnection(url_db, username_db, password_db);
            System.out.println("MySQL Connected");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Connection Failed" + e.getLocalizedMessage());
        }
        return conn;
    }
}
