
package gis;
import java.sql.Connection;
import java.sql.DriverManager;

public class GIS {


    
    public static void main(String[] args) {
        // TODO code application logic here
        // do all your testing of your modules here
        
    }
    
    /**
     * Constructor for the class that will initialize the fields and establish connection
     * to the database with the default parameters.
     */
    private GIS(){
        
     System.out.println("Opened database successfully");
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

     System.out.println("Opened database successfully");
    
    }
    
       /**
     * Returns the coordinates that the user would like to retrieve
     * provided the input variables are valid and the coordinates exists.
     *
     * @param b         String value to be used to get the coordinates
     * @return          The coordinates desired by the user with a float return type 
     */

    private float[] getCoordinates(String b){
        float[] temp={1,14};
        return temp;
    } 
    
         /**
     * Returns the location that the user would like to retrieve
     * provided the input variables are valid and the location exists.
     *
     * @param x         String value to be used to get the location.
     * @param y         String value to be used to get the location.
     * @return          Return the location as a String. 
     */
    private String getLocation( float x, float y )
    {
        
        return "IT 4-4";
        
    }

    
    
    public String getGISDataObject(String a){ return a;}
     public String modifyGISData(String a){ return a;}


  
   /**  
     * Creates a new table in the database, provided that the authenticated user has
     * the appropriate permissions.
     *
     * @param table     A string value of the object to be deleted
     * @return          A boolean value on whether the method was successful or not
     */
    private boolean newTable(String table){
    //creates new table from string
        return true;
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
        return true;
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
        return true;
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
        return true;
    }
    
}