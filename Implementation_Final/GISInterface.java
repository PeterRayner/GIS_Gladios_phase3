/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gis;
import java.util.ArrayList;

public interface GISInterface {

    public void createMap();

    public String getBuilding(String name);

    public ArrayList<String> getAllBuildings();

    ArrayList<String> getLectureHall(String building);

    public ArrayList<Double> getLectureCoordinates(String room);

    public ArrayList<Double> getBuildingCoordinates(String building);

    public ArrayList<String> getBuildingInRadius(double mLat, double mLon, double radius);

    public void insertBuilding(String name, String description, String geometry, String coordinates, String table);
}
