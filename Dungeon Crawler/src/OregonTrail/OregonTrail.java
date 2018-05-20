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
import OrgeonTrail.model.Scene;
import static java.lang.Boolean.TRUE;
import java.util.HashSet;


/**
 *
 * @author MasterCraft Computer
 */
public class OregonTrail 
{
    static void HansTest()
    {
        
    Location findLocation = new Location();

    findLocation.setVisited(TRUE);
    findLocation.setRow(2);
    findLocation.setColumn(3);
        
        //Boolean findLocationVisited = findLocation.getVisited();
       // Short findLocationRow = findLocation.getRow();
       // Short findLocationColumn = findLocation.getColumn();
        
    System.out.println(findLocation.toString());
    }

    static void TeamTest()
    {
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
    
    static void DevinsTest()
    {
    //      Devin's Test
    Scene sceneChecker = new Scene();
    sceneChecker.setName("numbah whan");
    sceneChecker.setObstacle("Big Rock");
    sceneChecker.setTerrain("Wild Amazon Jungle");
    sceneChecker.setWeather("It's raining Men!  Halelula!");
    sceneChecker.setSymbol("Tarus");
    sceneChecker.setDifficulty(10);
    sceneChecker.setSpeedValue(3);
    sceneChecker.setSceneRef("Index");
    sceneChecker.setAttribute("Faith");
    sceneChecker.setLocRef("Glossary");
    sceneChecker.setDescription("Blah Blah Blah");
    sceneChecker.setResourceAvail("Gold!");
    System.out.println(sceneChecker.toString());
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        HansTest();
        TeamTest();
        DevinsTest();
    }
}
