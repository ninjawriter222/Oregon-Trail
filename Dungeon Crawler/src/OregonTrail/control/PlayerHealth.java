/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.control;

import OregonTrail.OregonTrail;
import OregonTrail.model.Player;
import OregonTrail.model.Speed;

public class PlayerHealth {
    private static double playerHealth;
        
     static double checkSpeed(double getSpeed){
    double speed = getSpeed;
    
      if (speed < 1)
      {
          return -1;
      }
      
      if (speed > 3)
      {
          return -1;
      }
      
      return 1;
  }
    
    public static double checkRest (boolean rest){
        
        if (rest = true)
        {
            return 20;
        }
    
        return 0;
    }
        
//    public static int changeHealthAccordingToSpeed(int speed){
        
//        Player instance = new Player();
//        int currentHealth = instance.getHealth();
//        int newHealth = 0;
////        Speed instance1 = new Speed();
////        int speed = instance1.getSpeed();
//        if (speed == 1){
//            newHealth = currentHealth - 10;
//        }
//        if (speed == 2){
//            newHealth = currentHealth - 20;
//        }
//        if (speed == 3){
//            newHealth = currentHealth - 30;
//        }
//        instance.setHealth(newHealth);
//        return newHealth;
//        }
    
    public static void checkSickness(){
        System.out.println("***checkSickness called***");
        int currentHealth = OregonTrail.getPlayer().getHealth();
        if (currentHealth < 20)
            System.out.println("You have fallen ill.");
    }

    
}


