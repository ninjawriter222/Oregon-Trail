/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrgeonTrail.model;

import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author MasterCraft Computer
 */
public class Game implements Serializable
{
    private double totalMoves;
    private Player player;
    private ArrayList<Game> games = new ArrayList<Game>();
    private Map map;
    private Scene scene;
    
    public Game() 
    {
    
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    
    
}