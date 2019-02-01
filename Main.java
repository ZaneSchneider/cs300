//-------------------------------------------------------------------------------------------//
//
//  main.java
//
//  Version:    1.0
//  Date:       1.21.19
//
//  Created on: 1.21.19
//
//-------------------------------------------------------------------------------------------//

package company;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//main_menu();
		Map map = new Map();
		map.printMap();
	}

	
	//moved main menu to a seperate function for testing - Steven
	static void main_menu() {
		System.out.println("FFFFFFFFFFFFFFFFFFFFFF                                                                           lllllll ");
		System.out.println("F::::::::::::::::::::F                                                                           l:::::l ");
		System.out.println("F::::::::::::::::::::F                                                                           l:::::l ");
		System.out.println("FF::::::FFFFFFFFF::::F                                                                           l:::::l ");
		System.out.println("  F:::::F       FFFFFFrrrrr   rrrrrrrrr   uuuuuu    uuuuuu ppppp   ppppppppp     aaaaaaaaaaaaa    l::::l ");
		System.out.println("  F:::::F             r::::rrr:::::::::r  u::::u    u::::u p::::ppp:::::::::p    a::::::::::::a   l::::l ");
		System.out.println("  F::::::FFFFFFFFFF   r:::::::::::::::::r u::::u    u::::u p:::::::::::::::::p   aaaaaaaaa:::::a  l::::l ");
		System.out.println("  F:::::::::::::::F   rr::::::rrrrr::::::ru::::u    u::::u pp::::::ppppp::::::p           a::::a  l::::l ");
		System.out.println("  F:::::::::::::::F    r:::::r     r:::::ru::::u    u::::u  p:::::p     p:::::p    aaaaaaa:::::a  l::::l ");
		System.out.println("  F::::::FFFFFFFFFF    r:::::r     rrrrrrru::::u    u::::u  p:::::p     p:::::p  aa::::::::::::a  l::::l ");
		System.out.println("  F:::::F              r:::::r            u::::u    u::::u  p:::::p     p:::::p a::::aaaa::::::a  l::::l ");
		System.out.println("  F:::::F              r:::::r            u:::::uuuu:::::u  p:::::p    p::::::pa::::a    a:::::a  l::::l ");
		System.out.println("FF:::::::FF            r:::::r            u:::::::::::::::uup:::::ppppp:::::::pa::::a    a:::::a l::::::l");
		System.out.println("F::::::::FF            r:::::r             u:::::::::::::::up::::::::::::::::p a:::::aaaa::::::a l::::::l");
		System.out.println("F::::::::FF            r:::::r              uu::::::::uu:::up::::::::::::::pp   a::::::::::aa:::al::::::l");
		System.out.println("FFFFFFFFFFF            rrrrrrr                uuuuuuuu  uuuup::::::pppppppp      aaaaaaaaaa  aaaallllllll");
		System.out.println("                                                            p:::::p                                      ");
		System.out.println("                                                            p:::::p                                      ");
		System.out.println("                                                           p:::::::p                                     ");
		System.out.println("                                                           p:::::::p                                     ");
		System.out.println("                                                           p:::::::p                                     ");
		System.out.println("                                                           ppppppppp                                     ");

		System.out.println();
		System.out.println("Welcome to Frupal!");
		System.out.println("Enter '1' to start the game");
		System.out.println("Enter '2' to die instantly (Or go to the config file later)");
		System.out.println("Enter 'quit' to exit");

		Scanner kb = new Scanner(System.in);
		

		boolean cont = true;
		boolean playGame = false;

		while(cont) {
			String input = kb.nextLine();
			if (input.equalsIgnoreCase("quit")) {
				System.out.println("Okay, goodbye!");
				return;
			}
			else if(input.equalsIgnoreCase("1")){
				System.out.println("Okay, gaaaaame start!");
				//Start the game
				cont = false;
			}
			else if (input.equalsIgnoreCase("2")){
				System.out.println("You're dead now!");
				//open the config file, or just show the config file name
				cont = false;
			}
		}
	}

	/*
		//Gameloop, very basic right now as I'm not sure how this should be structured in relation to map and character
		while (playGame){
			//Draw map

			//display cordinates, money and energy

			System.out.println("Use wasd to move, pressing enter for each move.");
			System.out.println("Alternatively, type \"i\" to see your inventory, or \"q\" to quit.");

			String move = kb.nextLine();

			switch(move){
				case "w":   break;//move north
				case "a":   break;//move west
				case "s":   break;//move south
				case "d":   break;//move east
				case "i":   break;//show inventory
				case "q":   System.out.println("Are you sure? y/n");
					    move = kb.nextLine();
					    if (move.equalsIgnoreCase("y")){
						    endGame(1);
						    playGame=false;
						    break;
					    }
					    else
						    move = "q";
					    break;
				default:    System.out.println("Invalid entry, please input a valid command");

			}
			if (playGame) {
				//special tile activates
				if (!move.equalsIgnoreCase("i")) //and if tile is special {
					//tile.interact();
				}
			}


		}

	}
	*/
	private static boolean loadConfig(){
		//load in the config file and prepare game
		//Will do later as this is lower priority

		return false;
	}

	private static void endGame(int exitState){
		//a separate function to handle the ways the game can end

	}
}
