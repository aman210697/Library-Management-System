/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aman Bansal
 */

import java.sql.*;
import javax.swing.*;

public class javaConnect {
   
    public static Connection connectDB(){
         Connection conn ;
        try{
          Class.forName("org.sqlite.JDBC");
          conn=DriverManager.getConnection("jdbc:sqlite:E:\\NetBeansProjects\\Library Management System\\LibraryDatabase.sqlite ");
         return conn;
          
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
          return null;  
        }
        
    }
    
}
