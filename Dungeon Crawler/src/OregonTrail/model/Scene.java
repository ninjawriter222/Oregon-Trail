/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author MasterCraft Computer
 */
public class Scene implements Serializable 
{
    private String name;
    private String Obstacle;
    private String terrain;
    private String weather;
    private String symbol;
    private double difficulty;
    private double speedValue;
    private String sceneRef;
    private String attribute;
    private String locRef;
    private String description;
    private String resourceAvail;

    public Scene() {
    }
    
    public String getObstacle() {
        return Obstacle;
    }

    public void setObstacle(String Obstacle) {
        this.Obstacle = Obstacle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(double difficulty) {
        this.difficulty = difficulty;
    }

    public double getSpeedValue() {
        return speedValue;
    }

    public void setSpeedValue(double speedValue) {
        this.speedValue = speedValue;
    }

    public String getSceneRef() {
        return sceneRef;
    }

    public void setSceneRef(String sceneRef) {
        this.sceneRef = sceneRef;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getLocRef() {
        return locRef;
    }

    public void setLocRef(String locRef) {
        this.locRef = locRef;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getResourceAvail() {
        return resourceAvail;
    }

    public void setResourceAvail(String resourceAvail) {
        this.resourceAvail = resourceAvail;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + Objects.hashCode(this.Obstacle);
        hash = 67 * hash + Objects.hashCode(this.terrain);
        hash = 67 * hash + Objects.hashCode(this.weather);
        hash = 67 * hash + Objects.hashCode(this.symbol);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.difficulty) ^ (Double.doubleToLongBits(this.difficulty) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.speedValue) ^ (Double.doubleToLongBits(this.speedValue) >>> 32));
        hash = 67 * hash + Objects.hashCode(this.sceneRef);
        hash = 67 * hash + Objects.hashCode(this.attribute);
        hash = 67 * hash + Objects.hashCode(this.locRef);
        hash = 67 * hash + Objects.hashCode(this.description);
        hash = 67 * hash + Objects.hashCode(this.resourceAvail);
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
        final Scene other = (Scene) obj;
        if (Double.doubleToLongBits(this.difficulty) != Double.doubleToLongBits(other.difficulty)) {
            return false;
        }
        if (Double.doubleToLongBits(this.speedValue) != Double.doubleToLongBits(other.speedValue)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.Obstacle, other.Obstacle)) {
            return false;
        }
        if (!Objects.equals(this.terrain, other.terrain)) {
            return false;
        }
        if (!Objects.equals(this.weather, other.weather)) {
            return false;
        }
        if (!Objects.equals(this.symbol, other.symbol)) {
            return false;
        }
        if (!Objects.equals(this.sceneRef, other.sceneRef)) {
            return false;
        }
        if (!Objects.equals(this.attribute, other.attribute)) {
            return false;
        }
        if (!Objects.equals(this.locRef, other.locRef)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.resourceAvail, other.resourceAvail)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Scene{" + "name=" + name + ", Obstacle=" + Obstacle + ", terrain=" + terrain + ", weather=" + weather + ", symbol=" + symbol + ", difficulty=" + difficulty + ", speedValue=" + speedValue + ", sceneRef=" + sceneRef + ", attribute=" + attribute + ", locRef=" + locRef + ", description=" + description + ", resourceAvail=" + resourceAvail + '}';
    }
    
}

