//sample tiles

//package company;

import java.util.Random;

public abstract class Tile
{
	protected int id;         //tile id if needed
	protected int chance_val;  //for rand ops
	protected String name;    // tile name
	protected int fare;       // energy cost for moving across tile, 0 is free, 999 is impassible 
	protected boolean seen;
	
	Random r = new Random();
	int chance_range = 20;

    Tile(){
		id = 0; 
		name = ""; 
		fare = 999; 
		chance_val = r.nextInt(chance_range);
	 }  //default ctor
    Tile(int id_in, String name_in, int fare_in){
		id = id_in;
		name = name_in; 
		fare = fare_in; 
		chance_val = r.nextInt(chance_range);
	 }  //ctor takes all but chance val
    Tile(int id_in, String name_in, int fare_in, int chance_in){
		id = id_in;
		name = name_in; 
		fare = fare_in; 
		chance_val = chance_in; 
	}  //ctor takes all values

	public void set_id(int id_in){
		this.id = id_in;
	}
	public void set_name(String name_in){
		this.name = name_in;
	}
	public void set_fare(int fare_in){
		this.fare = fare_in;
	}
	public void set_seen(){
		this.seen = true;
	}
	public int get_id(){
		return this.id;
	}
	public String get_name(){
		return this.name;
	}
	public int get_fare(){
		return this.fare;
	}
	public int get_chance(){
		return chance_val;
	}
	public boolean get_seen(){
		return this.seen;
	}
}

class Basic extends Tile 
{
	protected int income; //money gained from a natural tile
	
	//Constructor
	Basic(char id, String name, int fare, int income){
		this.id = id;
		this.name = name;
		this.fare = fare;
		this.seen = false;
		this.income = income;
	}
	//Setters
	public void set_income(int income) {
		this.income = income;
	}
	//Getters
	public int get_income(){
		return this.income;
	}
}
