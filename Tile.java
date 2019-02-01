//sample tiles
package company;

import java.util.Random;

public abstract class Tile
{
	protected char id;         //tile id if needed
	protected String name;    // tile name
	protected int fare;       // energy cost for moving across tile, 0 is free, 999 is impassible 
	protected boolean seen;
	Tile(){
		this.id = ' '; 
		this.name = ""; 
		this.fare = 999;
		this.seen = false;
	}  //default ctor

	Tile(char id, String name, int fare){
		this.id = id; 
		this.name = name; 
		this.fare = fare;
		this.seen = false;
	}  //ctor takes all but chance val

	public void set_id(char id_in){
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
	public char get_id(){
		return this.id;
	}
	public String get_name(){
		return this.name;
	}
	public int get_fare(){
		return this.fare;
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
