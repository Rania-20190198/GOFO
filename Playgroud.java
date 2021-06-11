package src.System;
import src.Users.PlaygroundOwner;
import java.util.ArrayList;
import src.Users.Player;
public class Playgroud {
    protected String playgroundName;
    protected  PlaygroundOwner Owner;
    protected int bookingNum;
    protected double price;
    protected Address add;
    protected ArrayList<Slot> availability;
    protected boolean activated;
    protected static int count;
    protected double size;

    public Playgroud() {
        this.playgroundName = " ";
        this.Owner = Owner;
        this.bookingNum = count++;
        this.price = 0.0;
        availability = new ArrayList<>();
        this.activated = false;
        this.size=size;
    }
    
    public void setPlaygroundName(String playgroundName) {
        this.playgroundName = playgroundName;
    }

    public void setAddress(Address add) {
        this.add = add;
    }

    public void setAvailability(ArrayList<Slot> time) {
       availability.clear(); 
       availability.addAll(time);
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public PlaygroundOwner getOwner() {
        return Owner;
    }

    public int getBookingNum() {
        return bookingNum;
    }

    public Address getAddress() {
        return add;
    }

    public ArrayList<Slot> getAvailability() {
        return availability;
    }

    public boolean isActivated() {
        return activated;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }
     public boolean bookPlayground(Slot timeSlot, Player player) {
        if (!this.isActivated()) {
            return false;
        }
        double totalPrice;
        if (timeSlot.getStartHour() < timeSlot.getEndHour())
            totalPrice = price * (timeSlot.getEndHour() - timeSlot.getStartHour());
        else
            totalPrice = price * ((timeSlot.getEndHour() + 24) - timeSlot.getStartHour());
        if (player.geteWallet().getBalance() <= totalPrice) {
            return false;
        }
        for (int i = 0; i < availability.size(); i++)
            if (availability.get(i).equals(timeSlot)) {
                if (availability.get(i).isBooked())
                    return false;
                else {
                    availability.get(i).book(player.getuserName());
                    player.geteWallet().transfer(totalPrice, Owner);
                    return true;
                }
            }
        return false;
    }

    @Override
    public String toString() {
        return "Playgroud{" + "playgroundName=" + playgroundName + ", Owner=" + Owner + ", bookingNum=" + bookingNum + ", price=" + price + ", add=" + add + ", availability=" + availability + ", activated=" + activated + '}';
    }
    
    
}
