/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail;

import OrgeonTrail.model.Actor;
import OrgeonTrail.model.Player;

/**
 *
 * @author MasterCraft Computer
 */
public class OregonTrail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Fred Flinstone");
        playerOne.setBestScore(7.00);
        
        //String playerOneName = playerOne.getName();
        //double playerOneScore = playerOne.getBestScore();
        
        //System.out.println("Name = " + playerOneName +", time =" + playerOneScore);
    
        System.out.println(playerOne.toString());
    
        Actor.Bob.getName();
        Actor.Bob.getDescription();
    
    }
    
}
