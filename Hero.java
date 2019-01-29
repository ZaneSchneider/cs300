//Hero Class
//Steven Lee 1/28
package com.company;

public class Hero {

	//basic hero stats
	private String name;
	private int money;
	private int energy;
	private int posX;
	private int posY;
	//hero tools;
	private boolean hasToolOne;
	private boolean hasToolTwo;
	private boolean hasToolThree;
	private boolean hasBoat;
	private boolean hasBinoc;
	
	public Hero(String name, int money, int energy){
		//Set from Config File
		this.name = name;
		this.money = money;
		this.energy = energy;
		//All others set to default value (0 or false) to be set later
	}

	//Tool setting and checking functions
	//Steven Lee 1/28
	public void getTool(int type){
		switch (type) {
			case 1: this.hasToolOne = true;
				break;
			case 2: this.hasToolTwo = true;
				break;
			case 3: this.hasToolThree = true;
				break;
			case 4: this.hasBoat = true;
				break;
			case 5: this.hasBinoc = true;
				break;
			default:
				System.out.println("Error in getTool function: invalid tool type");
		}
	}

	public boolean hasTool(int type){
                switch (type) {
                        case 1: return this.hasToolOne;
                        case 2: return this.hasToolTwo;
                        case 3: return this.hasToolThree;
                        case 4: return this.hasBoat;
                        case 5: return this.hasBinoc;
                        default: return false;
         	}
	}
	
	//Energy get/set/Changing Functions
	//Steven Lee 1/28
	//sets energy value to a specified amount
	public void setEnergy(int amount) {
		this.energy = amount;
	}
	//returns current energy value
	public int getEnergy(int amount) {
		return this.energy;
	}
	//adds an amount to energy score
	public void addEnergy(int amount) {
		this.energy += amount;
	}
	//Subtracts amount from energy, and if energy goes below 0, sets it to 0
	public void subEnergy(int amount) {
		this.energy -= amount;
		if (this.energy <= 0)
			this.energy = 0;
	}

	//Money get/set/Changing Functions
	//Steven Lee 1/28
	//sets money value to a specified
	public void setMoney(int amount) {
		this.money = amount;
	}
	//gets current money value
	public int getMoney() {
		return this.money;
	}
	//adds an amount to money score
	public void addMoney(int amount) {
		this.money += amount;
	}
	public void subMoney(int amount) {
		this.money -= amount;
		if (this.money <= 0) 
			this.money = 0;
	}

	

}
