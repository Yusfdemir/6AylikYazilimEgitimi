/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javadatabase;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
/**
 *
 * @author yusuf
 */
public class DBClass {
    
     
    public static void main(String[] args){
        String pathToConnector="com.mysql.cj.jdbc.Driver";
        try{
            Class.forName(pathToConnector);
            System.out.println("Bağlantı Başarılı");
        }
        catch(ClassNotFoundException ex){
            System.out.println("Bağlantı Başarısız !!!");
            System.out.println(ex.getMessage());
        }
        
        Connection connect=null;
        String url="jdbc:mysql://localhost/university?user=root&password=";
        try{
            connect=DriverManager.getConnection(url);
            System.out.println("Bağlantı Başarılı");
        }
        catch(SQLException e){
            System.out.println("Bağlantı Başarısız !!!");
            System.out.println(e.getMessage());
        }
    }
    
    
        
}
