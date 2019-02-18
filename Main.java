//-------------------------------------------------------------------------------------------//
//
//  main.java
//
//  Version:    1.2
//  Date:       2.11.19 //Added basic game loop and separated main into functions
//
//  Created on: 1.21.19
//
//-------------------------------------------------------------------------------------------//

//package com.company;

import java.io.File;
import java.util.Scanner;

public class Main{

    public static final String NONE = "\033[0m"; //clears color
    public static final String RED = "\033[0;31m";
    public static final String GREEN="\033[0;32m";
    public static final String BRORNG="\033[0;33m";
    public static final String BLUE="\033[0;34m";
    public static final String YELLOW="\033[1;33m";
    private Map gameMap;
    private Hero hero;

    public void main(String[] args) {

        if(mainMenu()){
            if(loadConfig()) {
                gameLoop();
            }
            else{
                return;
            }
        }
        else {
            return;
        }

    }

    private boolean mainMenu(){
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

        while(cont) {
            String input = kb.nextLine();
            if (input.equalsIgnoreCase("quit")) {
                System.out.println("Okay, goodbye!");
                return false;
            }
            else if(input.equalsIgnoreCase("1")){
                System.out.println("Okay, gaaaaame start!");
                //Start the game
                return true;
            }
            else if (input.equalsIgnoreCase("2")){
                System.out.println("You're dead now!");
                //open the config file, or just show the config file name
                cont = false;
            }

        }
        return false;
    }

    private boolean gameLoop(){
        boolean playGame = true;
        //Gameloop, very basic right now as I'm not sure how this should be structured in relation to map and character
        Scanner kb = new Scanner(System.in);

        while (playGame){


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
                case "j":   //Teleport to jewel
                            //Draw the entire board (handled in end game
                            endGame(0);
                            break;
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
                if (!move.equalsIgnoreCase("i")) /*and if tile is special*/ {
                    //tile.interact();
                }
            }


        }
        return true;
    }


    //not finished, do not attempt to use.
    private boolean loadConfig(){
        //if file exists, continue
        //else return false

            File file = new File("config.txt");
            try {
                Scanner scan = new Scanner(file);

                int linenum = 0;
                String line;
                while (scan.hasNextLine()) {
                    line = scan.nextLine();

                    if (line.startsWith("#") || line.trim ().isEmpty ()) {
                        continue; // Ignore the line, it is empty or commented out.
                    }

                }
            }
            catch(java.io.FileNotFoundException badFile){
                System.out.println("No file of this name found, please enter a valid file name");
                return false;
            }
        //load in the config file and prepare game
        //Will do later as this is lower priority

        //uses defaults for nos, will read from config later

        hero = new Hero("Steve", 100, 100);
        gameMap = new Map();

        return true;
    }


    //exit state 0 = win the game
    //exit state 1 = lose game/0 energy
    //exit state 2 = error that cant be recovered from
    private void endGame(int exitState){
        //a separate function to handle the ways the game can end
        if (exitState == 0){
            System.out.println("You've won the game!");
            System.out.println("You ended with " + hero.getMoney() + " money, and " + hero.getEnergy() + "energy left.");
        }
        else if (exitState == 1){
            System.out.println("You lost, try again next time!");

        }
        else if (exitState == 2){
            System.out.println("Something strange has occurred, and the system cannot resolve the conflict. goodbye");
        }


    }
}
