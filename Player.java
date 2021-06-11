/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.Users;

import src.System.Playgroud;
import src.System.Slot;


/**
 *
 * @author rania
 */

public class Player extends User {
     public Player(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Player() {
        
    }
     public void setuserName(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Player{" + '}';
    }
    
    
     public boolean bookPlayground(Playgroud playground, Slot timeSlot) {
        if (playground.isActivated() && playground. bookPlayground(timeSlot, this) ) {
            return true;
        }
        return false;
    }

    public String getuserName() {
       return username;
    }
    
}
