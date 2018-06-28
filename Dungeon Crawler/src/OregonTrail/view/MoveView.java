/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.view;

import OregonTrail.control.LocationControl;
import OregonTrail.model.Location;
import OregonTrail.control.PlayerHealth;
import OregonTrail.model.Player;
import OregonTrail.model.Speed;
import java.util.Scanner;

/**
 *
 * @author MasterCraft Computer
 */
class MoveView extends View{

    public MoveView() {
        super("+++++++++++++++++++++++++++++++++++++++++++++++++++" 
                + "\n+             This is the Move Menu               +"
                + "\n+++++++++++++++++++++++++++++++++++++++++++++++++++"
                + "\nType the word corresponding" 
                + "\nto the speed you want to" 
                + "\ntravel at."
                + "\n"
                + "\nslow - sets your pace to slow" 
                + "\nnormal - sets your pace to noraml." 
                + "\nfast - sets your pace to fast." 
                + "\nrest - You won't move, but instead rest for a day."
                + "\nE - Press E to exit" 
                + "\n---------------------------");
    }
    
    @Override
    public boolean doAction(String inputs) {
        String speed = inputs;
        Speed instance = new Speed();
        double getSpeed = instance.setSpeed(speed);
        LocationControl instance1 = new LocationControl();
        Location instance3 = new Location();
        double row = instance3.getRow();
        double column = instance3.getColumn();
        if ("slow".equals(inputs) || "noramal".equals(inputs) || 
                "fast".equals(inputs)) {
            System.out.println("You have set your speed to " + inputs);
        if ("rest".equals(inputs)){
            System.out.println("You have chosen to rest.");
            Player instance2 = new Player();
            int newHealth = instance2.getHealth() + 20;
            instance2.setHealth(newHealth);
        }  
        PlayerHealth.checkSickness();
        LocationControl.changeLocation(row, column, getSpeed);
        PlayerHealth.changeHealthAccordingToSpeed();
        Player player = new Player();
        System.out.println("Current Health = " + player.getHealth());
        }
    return true;
    }
}    

