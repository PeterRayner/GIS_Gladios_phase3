package gis;
import java.sql.*; 
import java.util.*; 
import java.lang.*; 
import static java.sql.DriverManager.getConnection;
import org.postgis.*; 



public class GIS implements GISInterface {
    Connection conn = null;
    Statement statement = null;
  
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
    public GIS(String db, String password){

            java.sql.Connection conn; 

  try { 
    
    Class.forName("org.postgresql.Driver"); 
    String url = "jdbc:postgresql://localhost:5433/postgis_23_sample"; 
    
    // DriverManager.getConnection(url, username, password);
    conn = DriverManager.getConnection(url, "postgres", "1234"); 
    /* 
    * Add the geometry types to the connection. Note that you 
    * must cast the connection to the pgsql-specific connection 
    * implementation before calling the addDataType() method. 
    */
    ((org.postgresql.Connection)conn).addDataType("geometry","org.postgis.PGgeometry");
   // ((org.postgresql.Connection)conn).addDataType("box3d","org.postgis.PGbox3d");
    /* 
    * Create a statement and execute a select query. 
    */ 
   // PreparedStatement ps = conn.prepareStatement("CREATE TABLE IF NOT EXISTS buildings(");
   // ps.executeUpdate();
   // ps.close();
    
    
    // ps = conn.prepareStatement("CREATE TABLE IF NOT EXISTS lectureHalls");
   // ps.executeUpdate();
   // ps.close();
    
    
  // Statement s = conn.createStatement(); 
   // ResultSet r = s.executeQuery("select AsText(geom) as geom,id from geomtable"); 
   // while( r.next() ) { 
      /* 
      * Retrieve the geometry as an object then cast it to the geometry type. 
      * Print things out. 
      */ 
    //  PGgeometry geom = (PGgeometry)r.getObject(1); 
     // int id = r.getInt(2); 
     // System.out.println("Row " + id + ":");
     // System.out.println(geom.toString()); 
   // } 
   // s.close(); 
   // conn.close(); 
  } 
catch( Exception e ) { 
  e.printStackTrace(); 
  } 


     System.out.println("Opened database successfully");
    
    }




    /**
     * Queries the database and returns the coordinates for the respective building location
     *
     * @param b     name of the building
     * @return      array of coordinates for the requested building
     */
    @Override
    public float[] getCoordinates(String b){
        try {
            statement = conn.createStatement();
            ResultSet set = statement.executeQuery("SELECT * FROM LOCATIONS WHERE NAME = '" + b + "'");
            String[] coords = rs.getString("COORDINATES").split(",");
            float[] ret = new float[2];
            ret[0] = Float.valueOf(coords[0]);
            ret[1] = Float.valueOf(coords[1]);
          
            return ret;
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            
            // dummy result
            float[] temp={1,14};
            return temp;
        }
    } 
    

    /**
     * Queries the database and returns the building location for the respective coordinates
     * 
     * @param x     X coordinate of the building
     * @param y     Y coordinate of the building
     * @return      name of the building
     */
    @Override
    public String getLocation( float x, float y )
    {
        try {
            String coords = String.valueOf(x) + "," + String.valueOf(y);
            statement = conn.createStatement();
            ResultSet set = statement.executeQuery("SELECT * FROM LOCATIONS WHERE COORDINATES = '" + coords + "'");
            String ret = rs.getString("NAME");
          
            return ret;
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            
            // dummy result
            return "IT 4-4";
        }
    }
  
    /**
     * Returns all locations stored in the database
     *
     * @return  All locations
     */
    public String[] getAllLocations() {
        try {
            statement = conn.createStatement();
            ResultSet set = statement.executeQuery("SELECT COUNT(*) FROM LOCATIONS");
            int count = set.getInt(), k = 0;
            String[] ret = new String[count];
            set = statement.executeQuery("SELECT * FROM LOCATIONS");
            while (set.next())
                ret[k++] = set.getString("NAME");
            return ret;
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }


    @Override
    public String getGISDataObject(String a){ return a;}
    @Override
    public String modifyGISData(String a){ return a;}

   /**  
     * Creates a new table in the database, provided that the authenticated user has
     * the appropriate permissions.
     *
     * @param table     A string value of the object to be deleted
     * @return          A boolean value on whether the method was successful or not
     */
    @Override
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
    @Override
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
    
    @Override
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
    @Override
    public boolean delete(String values){
    //deletes item on the database
        return true;
    }
    
}
