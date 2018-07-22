/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.view;

import OregonTrail.OregonTrail;
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
class MoveView extends View {

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
//        String speed = inputs;
        Speed instance = new Speed();
        int speed = instance.setSpeed(inputs);
//        Location currentLocation = OregonTrail.getCurrentGame().getMap().getCurrentLocation();
//        double row = currentLocation.getRow();
//        double column = currentLocation.getColumn();
        if ("slow".equals(inputs)) {
            System.out.println("You have set your speed to " + inputs);
            int health = OregonTrail.getCurrentGame().getPlayer().getHealth();
            int slow = 10;
            int newHealth = health - slow;
            OregonTrail.getCurrentGame().getPlayer().setHealth(newHealth);
        }
        if ("normal".equals(inputs)){
            System.out.println("You have set your speed to " + inputs);
            int health = OregonTrail.getCurrentGame().getPlayer().getHealth();
            int normal = 20;
            int newHealth = health - normal;
            OregonTrail.getCurrentGame().getPlayer().setHealth(newHealth);
        }
        if("fast".equals(inputs)){
            System.out.println("You have set your speed to " + inputs);
            int health = OregonTrail.getCurrentGame().getPlayer().getHealth();
            int fast = 30;
            int newHealth = health - fast;
            OregonTrail.getCurrentGame().getPlayer().setHealth(newHealth);
        }
        if ("rest".equals(inputs)) {
                System.out.println("You have chosen to rest.");
            int health = OregonTrail.getCurrentGame().getPlayer().getHealth();
            int rest = 50;
            int newHealth = health + rest;
            OregonTrail.getCurrentGame().getPlayer().setHealth(newHealth);
            }
            PlayerHealth.checkSickness();
            int ret = LocationControl.changeLocation(speed);
            Player player = new Player();
            System.out.println("Current Health = " + OregonTrail.getPlayer().getHealth());
        if (ret == 3){
            System.out.println("You have 0 HP, you have died.");
        }
            if (ret == 2) {
                System.out.println("You have successfully made it to Zion.");
                
            } else {
                System.out.println("You have successfully moved to " + OregonTrail.getCurrentGame().getMap().getCurrentLocation().getScene().getName());
            }
        return true;
        }
    }

