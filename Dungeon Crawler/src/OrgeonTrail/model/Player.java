/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrgeonTrail.model;

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
    public Player() 
    {
       
    }

    /**
     * Get the value of currentCash
     *
     * @return the value of currentCash
     */
    public double getCurrentCash() {
        return currentCash;
    }

    /**
     * Set the value of currentCash
     *
     * @param currentCash new value of currentCash
     */
    public void setCurrentCash(double currentCash) {
        this.currentCash = currentCash;
    }

    public ArrayList<Game> getGames() {
        return games;
    }

    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }
    
    public Player(String name, double bestScore) {
        this.name = name;
        this.bestScore = bestScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
