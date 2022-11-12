/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package form;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author donam
 */
public class DBConnection {
    
    static Connection connect = null;
    
    public static Connection getConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                        String url="jdbc:sqlserver://localhost:1433;databaseName=QLKS;"
                    + "encrypt=false";
                    
            String user="sa";
            String pass="1234";
            connect=DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connect;
    }
    
}
