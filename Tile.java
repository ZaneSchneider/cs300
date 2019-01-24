//sample tiles
package com.company;
import java.util.Random;
public class Tile
{
    private int id;         //tile id if needed
    private String name;    // tile name
    private int fare;       // energy cost for moving across tile, 0 is free, 999 is impassible 
    private int chance_val; //int value for chance

    Tile(){id = 0; name = ""; fare = 999; chance_val = new Random(); }  //default ctor
    Tile(int id_in, String name, int fare_in){
        id = id_in; name = name_in; fare = fare_in; chance_val = new Random(); }  //ctor takes all but chance val
    Tile(int id_in, String name, int fare_in, int chance_in){
        id = id_in; name = name_in; fare = fare_in; chance_val = chance_in; }  //ctor takes all but chance val

    public void set_id(int id_in){ this.id = id_in;}
    public void set_name(String name_in){this.name = name_in;}
    public void set_fare(int fare_in){this.fare = fare_in;}
    public String get_name(){return this.name;}
    public String get_fare(){return this.name;}


public class boulder_tile extends tileX
{
    
    
}
