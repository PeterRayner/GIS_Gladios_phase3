
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
    
    /**
     * Constructor for the class that will initialize the fields and establish connection
     * to the database with the default parameters.
     */
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
    
    /**
     * Constructor for the class that will initialize the fields and establish connection
     * to the database.
     *
     * @param db        String value that holds the name of the database
     * @param password  String value that holds the password which will authenticate the
     *                  connection
     */
    private GIS(String db, String password){

        this.dbName=db;
        this.PassName=password;

        // connect to database using these attributes
    // takes db name and password artibute and connects to them
    
    }
    
    /**  
     * Creates a new table in the database, provided that the authenticated user has
     * the appropriate permissions.
     *
     * @param table     A string value of the object to be deleted
     * @return          A boolean value on whether the method was successful or not
     */
    private boolean newTable(String table){
    //creates new table from string
    
    }
    
    /**  
     * Inserts an item into the database, provided that the authenticated user has the
     * appropriate permissions.
     *
     * @param values    A string value of the object to be inserted
     * @return          A boolean value on whether the method was successful or not
     */
    private boolean insert(String values){
    //inserts values into database
    
    }
     
    /**  
     * Updates an item from the database, provided that the authenticated user has the
     * appropriate permissions.
     *
     * @param values    A string value of the object to be updated
     * @return          A boolean value on whether the method was successful or not
     */ 
    private boolean update(String values){
    //updates value with given values string
    
    }
      
    /**  
     * Removes an item from the database, provided that the authenticated user has the
     * appropriate permissions.
     *
     * @param values    A string value of the object to be deleted
     * @return          A boolean value on whether the method was successful or not
     */
    private boolean delete(String values){
    //deletes item on the database
    
    }
    
}
