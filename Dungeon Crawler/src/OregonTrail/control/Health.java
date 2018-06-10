/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.control;

import OregonTrail.model.Speed;


/**
o	Health increases or decreases dependent upon the pace.
	Health can greatly increase if they REST

 *
 * @author MasterCraft Computer
 */
public class Health {

    private static double playerHealth;
        
  public static double checkSpeed(double getSpeed){
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
        
    public static double changeHealth (double speed, int rest){
        
        double newSpeed = speed;
        double newRest = rest;
        double health = newSpeed + newRest;
        
        double newHealth = playerHealth - health;
        
        return newHealth;
        
        
        }
}


