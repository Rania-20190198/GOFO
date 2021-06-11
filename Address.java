package src.System;
    import java.util.Scanner;
public class Address {
    protected int stNumber;
    protected String stName, city;
    protected String neighborhood;
    
    public Address(){
    }

    public Address(int stNumber, String stName, String city) {
        this.stNumber = stNumber;
        this.stName = stName;
        this.city = city;
    }

    Address(int stNumber, String stName, String neighborhood, String city) {
        this.stNumber = stNumber;
        this.stName = stName;
        this.city = city;
        this.neighborhood=neighborhood;
    }
    

    public void setStNum(int stNumber) {
        this.stNumber = stNumber;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getStNumber() {
        return stNumber;
    }

    public String getStName() {
        return stName;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Address:" + stNumber + " "+ stName + " " + city ;
    }   
}
