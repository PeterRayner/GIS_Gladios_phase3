/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gis;

public interface GISInterface{
  
    public float[] getCoordinates(String b);
     public String getLocation( float x, float y );
     public String getGISDataObject(String a);
      public String modifyGISData(String a);
      public boolean newTable(String table);
      public boolean insert(String values);
       public boolean update(String values);
       public boolean delete(String values);

}
    

