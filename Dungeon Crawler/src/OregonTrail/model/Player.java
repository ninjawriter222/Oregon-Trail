/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
/**
 *
 * @author MasterCraft Computer
 */
public class Player implements Serializable
{

    private String name;
    private double bestScore;
    private ArrayList<Game> games = new ArrayList<Game>();
    private double currentCash;
    private int Health;
    private Player player;
    public Player() {
       
    }
    
    public int getHealth() {
        return Health;
    }
    
    public void setHealth(int Health) {
        this.Health = Health;
    }
    
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public double getCurrentCash() {
        return currentCash;
    }

    public void setCurrentCash(double currentCash) {
        this.currentCash = currentCash;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public ArrayList<Game> getGames() {
        return games;
    }

    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }

    public double getBestScore() {
        return bestScore;
    }

    public void setBestScore(double bestScore) {
        this.bestScore = bestScore;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.bestScore) ^ (Double.doubleToLongBits(this.bestScore) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (Double.doubleToLongBits(this.bestScore) != Double.doubleToLongBits(other.bestScore)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        
        return "Player{" + "name=" + name + ", bestScore=" + bestScore + '}';
    }
}
