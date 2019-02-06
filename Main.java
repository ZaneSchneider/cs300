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
//package disabled so everyone doesnt have to set filepaths
//package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
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
}
