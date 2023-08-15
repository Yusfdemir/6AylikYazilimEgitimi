/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javadatabase;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.*;
/**
 *
 * @author yusuf
 */
public class JavaDataBase {
    public static final String DB_URL = "jdbc:mysql://localhost/university";
     public static final String DB_USER = "root"; 
     public static final String DB_PASSWORD = "";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Connection connect=null;
        Statement st=null;
        //SQL for get data
        String sqlGetData="SELECT * FROM student";
        //SQL for insert data 
        String sqlInsertData="INSERT INTO student (student_name,student_class) VALUES ('Damla',4)";
        String preInsert="INSERT INTO student (student_name,student_class) VALUES (?,?)";
        //SQL for update data 
        String updateSql="UPDATE student SET student_name='Mahmut Çetindağ' WHERE student_id=1";
        String preUpdateSql="UPDATE student SET student_name=? WHERE student_id=?";
        //SQL for delete data 
        String deleteSql="DELETE FROM student WHERE student_id=4";
        String preDeleteSql="DELETE FROM student WHERE student_id=?";
        
        try{
            connect=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            st=connect.createStatement();
            // GET DATA
            /*ResultSet data=st.executeQuery(sqlGetData);
            while(data.next()){
                System.out.println("ID: "+data.getInt("student_id"));
                System.out.println("Ad: "+data.getString("student_name"));
                System.out.println("Sınıf: "+data.getInt("student_class"));
            }*/
            
            // INSERT DATA
            //st.executeUpdate(sqlInsertData);
            PreparedStatement prSt=connect.prepareStatement(preDeleteSql); // Parantez içine işleme göre uygun sql stringi atanmalı 
            /*
            prSt.setString(1, "Ahmet");
            prSt.setInt(2,5);
            prSt.executeUpdate();
            prSt.close();
            */
            
            //UPDATE DATA
            //st.executeUpdate(updateSql);
            /*prSt.setInt(2,1);
            prSt.setString(1,"Mahmut Mustafa");
            prSt.executeUpdate();*/
            
            //DELETE
            prSt.setInt(1, 3);
            prSt.executeUpdate();
            
            //Tüm bağlantıları kapama
            st.close();
            connect.close();
            prSt.close();
        }
        catch(SQLException e){
            System.out.println("Bağlantı Başarısız !!!");
            System.out.println(e.getMessage());
        }
        
        
    }
    
}
