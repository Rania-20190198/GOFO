/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.System;

import java.util.ArrayList;
import java.util.Scanner;
import src.Users.Player;

/**
 *
 * @author rania
 */
public class playerMain {

    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Playgroud> playgrounds;
    private ArrayList<Player> players;
    private int currentPlayer;

 
    public playerMain(ArrayList<Playgroud> playgrounds, ArrayList<Player> players, int currentPlayer) {
        this.playgrounds = playgrounds;
        this.players = players;
        this.currentPlayer = currentPlayer;
        mainMenu();
    }

    public playerMain() {
        this.players=players;
        this.playgrounds=playgrounds;
         this.currentPlayer=currentPlayer;
          mainMenu();
    }

    
public void mainMenu() {
        String choice = "";
        
        while(true){
        System.out.println("\n1-Book a Playground\n2-Exit");
       choice = scanner.nextLine();
        if(choice.equalsIgnoreCase("1")){
            BookPlayground();
        }
        else if(choice.equalsIgnoreCase("2"))
        {
            break;
        }
        }
}
    
public Slot setslot() 
{
        int day, month, year, startingHour, endingHour;
        System.out.println("\nEnter timeslot details:- ");
        System.out.print("\n1-Enter day: ");
        day= scanner.nextInt();
        System.out.print("\n2-Enter month: ");
        month = scanner.nextInt();
        System.out.print("\n3-Enter year: ");
        year = scanner.nextInt();
        System.out.print("\n4-Enter startHour: ");
        startingHour = scanner.nextInt();
         System.out.print("\n5-Enter endHour: ");
        endingHour = scanner.nextInt();
        return new Slot(day, month, year, startingHour, endingHour);
            
}

private void BookPlayground() {
     
       
        System.out.println("Enter the name of playground");
        String choice;
        Playgroud playground=new Playgroud();
        Player player=new Player();
        choice=scanner.nextLine();
        System.out.println("Enter time slot details to be booked: ");
        Slot timeSlot = setslot();
        playground.bookPlayground(timeSlot, player);
       
            System.out.println("\nPlayground Booked Successfully");
            
   
    }
}

