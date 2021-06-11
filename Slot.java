package src.System;
import java.util.Scanner;
public class Slot {
    protected int day, month,year;
    protected double startHour,endHour;
    protected boolean booked;
    protected String bookedTo;

    public Slot(){
        this.day = 1;
        this.month = 1;
        this.year = 2021;
        this.startHour = 0.0;
        this.endHour = 0.0;
        this.booked = false;
    }
    
    public Slot(int day, int month, int year, double startHour, double endHour, boolean booked) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.startHour = startHour;
        this.endHour = endHour;
        this.booked = booked;
    }
    public void book(String username){
        booked = true;
        bookedTo=username;
    }
    public void unBooked(){ 
        booked = false;
        bookedTo=" ";
    }
    public boolean isBooked(){
        return booked;
    }

    public boolean setDay(int day) {
        if(day<1 && day>31)
            return false;
        else{
            this.day=day;
            return true;
        }
    }

    public boolean setMonth(int month) {
        if(month<1 && month>12)
            return false;
        else{
        this.month = month;
        return true;
        }
    }

    public boolean setYear(int year) {
        if(year<2021)
            return false;
        else{
        this.year = year;
        return true;
        }
    }

    public boolean setStartHour(double startHour) {
        if(startHour<0 && startHour>23){
            return false;
        }
        else{ 
        this.startHour = startHour;
        return true;
        }
    }

    public boolean  setEndHour(double endHour) {
        if(endHour<0 && endHour>23){
            return false;}
        else{
        this.endHour = endHour;
        return true;
        }
    }

    public void setBookedTo(String bookedTo) {
        this.bookedTo = bookedTo;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public double getStartHour() {
        return startHour;
    }

    public double getEndHour() {
        return endHour;
    }

    public String getBookedTo() {
        return bookedTo;
    }

    @Override
    public String toString() {
       String info= "Date: "  + day + " / " + month + " / " + year +
                "\n Startimg Hour: " + startHour + "\n Ending Hour: " + endHour; 
                if (isBooked()){
                    info+="\n Booked= No" ;
                }
                else{
                    info+="\n Booked= Yes" ;
                    info+="\n Booked To:" + bookedTo ;
                }
            return info;
    }    
}
