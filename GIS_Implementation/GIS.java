<<<<<<< HEAD

//package gis;
import java.sql.Connection;
import java.sql.DriverManager;

public class GIS {


=======
package gis;
import java.sql.Connection;
import java.sql.DriverManager;

public class GIS implements GISInterface {
  
>>>>>>> bb15c0c3c4859fe2c4bf03fce76686f6d9269b32
    public static void main(String[] args) {
        // TODO code application logic here
        // do all your testing of your modules here
        GIS gis = new GIS();
        GIS g = new GIS("mongo", "gisDep");

        gis.getCoordinates("LAB300");
        String loc = g.getLocation(4.42f, 2.44f);
        System.out.println(loc);
        gis.getGISDataObject("GISdataObject");
        g.modifyGISData("ModifiedGIS");
        gis.newTable("Issa New Table");
        g.update("Update");
        gis.insert("Going In!");
        g.delete("To the Abyss");
        
        
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
    public GIS(String db, String password){

     System.out.println("Opened database successfully");
    
    }
    

  public float[] getCoordinates(String b){
        float[] temp={1,14};
        return temp;
    } 
    
    public String getLocation( float x, float y )
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
    public boolean newTable(String table){
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
    public boolean insert(String values){
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
    
    public boolean update(String values){
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
    public boolean delete(String values){
    //deletes item on the database
        return true;
    }
    
}
