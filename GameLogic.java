/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cis18a.finalproject;

/**
 *
 * @author paolo
 */
import java.util.Scanner;

public class GameLogic {
    static Scanner scanner = new Scanner(System.in);
    
    static Player player;
    static Friend friend;
    
    //Story elements
    public static int place = 0;
    public static String[] places = {"Park", "Ice Cream Truck", "Burger Stand"};
    
    public static boolean isRunning;
    
    public static int readInt(String prompt, int userChoices)
    {
        int input;
        
        do
        {
            System.out.println(prompt);
            try {
                input = Integer.parseInt(scanner.next());
            }
            catch(Exception e)
            {
                input = -1;
                System.out.println("Please enter a valid integer!");
            }
        }
        while(input < 1 || input > userChoices);
        return input;
    }
    
    public static void clearConsole()
    {
        for (int i = 0; i < 15; i++)
            System.out.println();
    }
    
    public static void printLine(int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print("-");
        System.out.println();
    }
    public static void printHeader(String title)
    {
        printLine(30);
        System.out.println(title);
        printLine(30);
    }
    public static void ContinueButton()
    {
        System.out.println("\nType any number to continue.");
        scanner.next();
    }
    
    public static void startGame()
    {
        boolean setName = false;
        String name;
        //Display the title name
        clearConsole();
        printLine(30);
        System.out.println("A DAY WITH BEN...");
        printLine(30);
        ContinueButton();
        //Get the player name
        do{
            clearConsole();
            printHeader("What's your name?");
            name = scanner.next();
            //Ask the player if they want to continue with name
            clearConsole();
            printHeader("Ah, you chose " + name + ".\nIs this correct?");
            System.out.println("1) Yes!\n2) Nevermind, let's change it.");
            int input = readInt("-> ", 2);
            if (input == 1)
                setName = true;
        }while (!setName);
        //Displaying the story intro first 
        TextNovel.gameIntro();
        //New player object with name
        player = new Player(name);
        friend = new Friend("Ben");
        //Continuing the story in first dialogue
        TextNovel.dialogue1(friend, player);
        TextNovel.dialogue2(friend, player);
        TextNovel.dialogue3(friend, player);
        TextNovel.dialogue4(friend, player);
        TextNovel.ending(friend, player);
        //Setting isRunning to true, so it can loop
        isRunning = true;
        
        //start the main game
        gameLoop();
    }
    
    //The function to continue the game
    public static void continueGame()
    {
        
    }
    //The method that prints the menu
    public static void printMenu()
    {
        clearConsole();
        printHeader(places[place]);
        System.out.println("Would like to continue?");
        printLine(30);
        System.out.println("1) Yes.\n2) Quit.");
    }
    //GAYme loop goes here
    public static void gameLoop()
    {
        while (isRunning)
        {
            printMenu();
            int input = readInt("-> ", 2);
            if(input == 1)
                continueGame();
            else
                isRunning = false;
        }
    }
}
