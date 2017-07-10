/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import static App.MainDb.DRIVER;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Pan
 */
public class MainDb {
    
    public static final String DRIVER = "org.postgresql.Driver";
    public static final String DB_URL = "jdbc:postgresql://serwer1749827.home.pl:5432/23778244_0000001";
    private static final String USER = "23778244_0000001";
    private static final String PASS = "marcin901";
    
    private Connection conn;
    private Statement stat;
    
     public MainDb() {
        try {
            Class.forName(MainDb.DRIVER);
            
        } catch (ClassNotFoundException e) {
            System.err.println("Brak sterownika JDBC");
            e.printStackTrace();
        }
        
        try{
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stat = conn.createStatement();
            System.out.println("połączono z bazą");
        }catch(SQLException e){
            System.err.println("Problem z otwarciem polaczenia");
            e.printStackTrace();
        }
        
     }
     
     public ResultSet query(String query)
     {
         ResultSet result = null;
         try{        
             result = stat.executeQuery(query);
         }catch(SQLException e)
         {
             System.err.println("Błąd przy wykonywaniu zapytania");
             e.printStackTrace();
         }
         return result;
     }
     
     
      public void updateQuery(String query)
     {
        
         try{        
             stat.executeQuery(query);
         }catch(SQLException e)
         {
             System.err.println("Błąd przy wykonywaniu zapytania");
             e.printStackTrace();
         }
        
     }
     
   
     
}
