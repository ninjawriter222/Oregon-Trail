/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail;

import OrgeonTrail.model.Actor;
import OrgeonTrail.model.Location;
import OrgeonTrail.model.Map;
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
        
        
        /*
        static void hansTest();
        
        Location findLocation = new Location();
        
        findLocation.setVisited(Boolean.TRUE);
        findLocation.setRow(Short.MIN_VALUE);
        findLocation.setColumn(Short.MIN_VALUE);
        
        Boolean findLocationVisited = findLocation.getVisited();
        Short findLocationRow = findLocation.getRow();
        Short findLocationColumn = findLocation.getColumn();
        
        System.outprintln(findLocation.toString());
        */
//        
//        Map.AshHollow.getName();
//        Map.AshHollow.getDescription();
//        Map.AshHollow.getCoordinates();
        
    }
    
}
