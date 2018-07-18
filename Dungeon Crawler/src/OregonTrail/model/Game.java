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
public class Game implements Serializable
{
    private double totalMoves;
    private Player player;
    private ArrayList<Game> games = new ArrayList<Game>();
    private Map map;
    private Scene scene;
    private ArrayList<Actor> actors = new ArrayList<Actor>();
    private ArrayList<Inventory> items = new ArrayList<Inventory>();
    private InventoryItem[] inventory;
    private Game game;
    private boolean gameOver;

    public Game() {
        gameOver = false;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }
    
    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public ArrayList<Game> getgame(Game currentGame) {
        return games;
    }
    
    public void setGame(ArrayList<Game> games){
        this.games = games;
    }
    
    public InventoryItem[] getInventory() {
        return inventory;
    }

    public void setInventory(InventoryItem[] inventory) {
        this.inventory = inventory;
    }
    
    public ArrayList<Actor> getActors() {
        return actors;
    }

    public void setActors(ArrayList<Actor> actors) {
        this.actors = actors;
    }

    public ArrayList<Inventory> getItems() {
        return items;
    }

    public void setItems(ArrayList<Inventory> items) {
        this.items = items;
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

    public double getTotalMoves() {
        return totalMoves;
    }

    public void setTotalMoves(double totalMoves) {
        this.totalMoves = totalMoves;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.totalMoves) ^ (Double.doubleToLongBits(this.totalMoves) >>> 32));
        hash = 53 * hash + Objects.hashCode(this.player);
        hash = 53 * hash + Objects.hashCode(this.games);
        hash = 53 * hash + Objects.hashCode(this.map);
        hash = 53 * hash + Objects.hashCode(this.scene);
        hash = 53 * hash + Objects.hashCode(this.actors);
        hash = 53 * hash + Objects.hashCode(this.items);
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "totalMoves=" + totalMoves + ", player=" + player + ", games=" + games + ", map=" + map + ", scene=" + scene + ", actors=" + actors + ", items=" + items + "}";
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.totalMoves) != Double.doubleToLongBits(other.totalMoves)) {
            return false;
        }
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        if (!Objects.equals(this.games, other.games)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        if (!Objects.equals(this.scene, other.scene)) {
            return false;
        }
        if (!Objects.equals(this.actors, other.actors)) {
            return false;
        }
        if (!Objects.equals(this.items, other.items)) {
            return false;
        }
        return true;
    }
    
}