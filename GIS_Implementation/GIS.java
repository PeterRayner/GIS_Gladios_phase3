
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;
package gis;

/**
 *
 * @author peter
 */
public class GIS {

    private String dbName; // database name
     private String PassName; // password for database
    
    public static void main(String[] args) {
        // TODO code application logic here
        // do all your testing of your modules here
        
    }
    
    private GIS(){
    
            Connection c = null;
      try {
         Class.forName("org.postgresql.Driver");
         c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb","postgres", "123");
      } 
      
      catch (Exception e) {
         e.printStackTrace();
         System.err.println(e.getClass().getName()+": "+e.getMessage());
         System.exit(0);
      }
      
     // System.out.println("Opened database successfully");
   }
    // implement default connection to db
    
    }
    
    private GIS(String db, String password){

        this.dbName=db;
        this.PassName=password;

        // connect to database using these attributes
    // takes db name and password artibute and connects to them
    
    }
    
    private boolean newTable(String table){
    //creates new table from string
    
    }
    
     private boolean insert(String values){
    //inserts values into database
    
    }
     
     
      private boolean update(String values){
    //updates value with given values string
    
    }
      
      
      
      private boolean delete(String values){
    //deletes item on the database
    
    }
    
}
