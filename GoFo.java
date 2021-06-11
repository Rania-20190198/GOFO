package gofo;
import static java.lang.System.exit;
import java.util.Scanner;
import src.System.Address;

import src.System.Playgroud;
import src.System.Slot;
import src.System.register;
import src.Users.Administrator;
import src.Users.Player;
import src.Users.PlaygroundOwner;
public class GoFo {

    public static void main(String[] args) {
        int choose;
        Scanner input = new Scanner(System.in);
        Playgroud playground=new Playgroud();
        while(true){
        System.out.println("1- Register \n" + "2- Add playground \n"+"3- Booking \n"+"4- Exit");
        choose=input.nextInt();

      if (choose==2){
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter Playground Name: ");
        String playgroundName = scanner.nextLine();
        playground.setPlaygroundName(playgroundName);
        System.out.println("Enter Address: ");
        System.out.print("Enter Street number: ");
        int streetNumber = scanner.nextInt();
        System.out.print("Enter Street name: ");
        scanner.skip("\n");
        String streetName = scanner.nextLine();
        System.out.print("Enter City: ");
        String city = scanner.nextLine();
        Address address = new Address(streetNumber, streetName,city);
        playground.setAddress(address);
        System.out.println("Enter Size: ");
        int size = scanner.nextInt();
        playground.setSize(size);
        System.out.println("Enter pricePerHour: ");
        double price = scanner.nextDouble();
        playground.setPrice(price);
        System.out.println("Added Successfully"+playground);
        
        
      }
      if (choose==4){
          exit(0);
      }
      if(choose==1){
          Player p=new Player();
           Playgroud playgroun=new Playgroud();
           PlaygroundOwner p1=new PlaygroundOwner();
           Administrator ad=new Administrator();
         register r=new register();
      
      }
      if(choose==3){
      Player p=new Player("Ahmed","012365"); 
 
      Slot s=new Slot();
      Playgroud p1=new Playgroud();
      
     p.bookPlayground(p1, s);
      }
        }
    }
}
   