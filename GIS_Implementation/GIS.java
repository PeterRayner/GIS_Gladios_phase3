
package gis;
import java.sql.Connection;
import java.sql.DriverManager;

public class GIS {


    
    public static void main(String[] args) {
        // TODO code application logic here
        // do all your testing of your modules here
        
    }
    
    private GIS(){
        
     System.out.println("Opened database successfully");
   }
   
    
    
    
    private GIS(String db, String password){

     System.out.println("Opened database successfully");
    
    }
    
    private float[] getCoordinates(String b){
        float[] temp={1,14};
        return temp;
    } 
    
    private String getLocation( float x, float y )
    {
        
        return "IT 4-4";
        
    }
    
    private boolean newTable(String table){
    //creates new table from string
        return true;
    }
    
     private boolean insert(String values){
    //inserts values into database
        return true;
    }
     
     
      private boolean update(String values){
    //updates value with given values string
        return true;
    }
      
      
      
      private boolean delete(String values){
    //deletes item on the database
        return true;
    }
    
}
