package src.System;
import src.Users.User;
import java.util.Scanner;
public class eWallet {
    protected double balance;

    public eWallet() {
        this.balance =0;
    }

    public eWallet(double balance) {
        this.balance = balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    
    public void deposit (double amount){
        balance =balance+amount;
    }
    
    public void withdraw(double amount){
        balance=balance-amount;
    }
    
    public boolean transfer(double amount, User user){
        if(amount >balance || amount <=0){
            return false;
        }
        else{
            user.geteWallet().deposit(amount);
            balance=balance-amount;
            return true;
        }        
    }    

    @Override
    public String toString() {
        return "eWallet{" + "balance=" + balance + '}';
    }
}
