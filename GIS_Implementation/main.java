/*
Main to implement the various functions of the GIS object class
*/
public class main {

	public static void main(String [] args) {
        // TODO code application logic here
        // do all your testing of your modules here
		
		//GIS object to handle requests
		GIS myObject = new GIS("Locations", "password");
		
		//Getting the coordinates of the building IT 4-4
		System.out.println("Getting coordinates for IT 4-4");
		float[] coordinates = myObject.getCoordinates("IT 4-4");
		System.out.println("Coordinates: [" + coordinates[0] + ", " + coordinates[1] + "]");
		
		//Getting the location for the coordinates [1, 14]
		System.out.println("Getting location from coordinates: [1.0, 14.0]");
		System.out.println("Location: " + myObject.getLocation(1, 14));
        
    }

}
