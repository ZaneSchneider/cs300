//sample tiles
import java.util.Random;
public class Tile
{
    private int id;
    private String name;
    private int fare;
    private int chance_val;

    Tile(){id = 0; name = ""; fare = 999; chance_val = new Random(); }

    public void set_id(int id_in){ this.id = id_in;}
    public void set_name(String name_in){this.name = name_in;}
    public void set_fare(int fare_in){this.fare = fare_in;}
    public String get_name(){return this.name;}
    public String get_fare(){return this.name;}


public class bolder_tile extends Tile
{
    
    
}
