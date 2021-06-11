/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.System;

import java.util.ArrayList;
import java.util.Scanner;
import src.Users.Administrator;
import src.Users.Player;
import src.Users.PlaygroundOwner;

/**
 *
 * @author rania
 */
public class register {

    ArrayList<Player> players;
    ArrayList<PlaygroundOwner> owners;
    ArrayList<Playgroud> playgrounds;
    ArrayList<Administrator> admins;
    private Scanner scanner = new Scanner(System.in);

    /**
     * A constructor for the {@code UI} object
     */
    public register(ArrayList<Player> players, ArrayList<PlaygroundOwner> owners, ArrayList<Playgroud> playgrounds, ArrayList<Administrator> admins) {
        this.players = players;
        this.owners = owners;
        this.playgrounds = playgrounds;
        this.admins = admins;
        mainMenu();
    }

    public register() {
         this.players = players;
        this.owners = owners;
        this.playgrounds = playgrounds;
        this.admins = admins;
        mainMenu();
    }
    public void mainMenu()
    {
        String choice="";
        while(true){
      System.out.println("\n1-Sign up\n2-Exit");
      choice = scanner.nextLine();
      if(choice.equalsIgnoreCase("1") ){Signup();}
      else if(choice.equalsIgnoreCase("2")){break;}
        }
    }
  public void Signup(){
  String username, password, phone, email, firstName, lastName, streetName, neighborhood, city;
  int strNumber;
        Address address;
        
        System.out.print("Enter new username: ");
        username = scanner.nextLine();
        System.out.print("Enter new Email: ");
        email = scanner.nextLine();  
        System.out.print("Enter new password (at least 8 letters, include 1 symbol and 1 Uppercase letter): ");
        password = scanner.nextLine();
        System.out.print("Enter Phone Number: ");
        phone = scanner.nextLine();
        System.out.print("Enter First Name: ");
        firstName = scanner.nextLine();
        System.out.print("Enter Last Name: ");
        lastName = scanner.nextLine();
        
        System.out.println("Address Informations;- ");
        System.out.print("1-Enter Street number: ");
        strNumber = scanner.nextInt();
        System.out.print("2-Enter Street name: ");
        scanner.skip("\n");
        streetName = scanner.nextLine();
        System.out.print("3-Enter Neighborhood: ");
        neighborhood = scanner.nextLine();
        System.out.print("4-Enter City: ");
        city = scanner.nextLine();
        address=new Address(strNumber, streetName, neighborhood, city);
       
        
  }  
}
