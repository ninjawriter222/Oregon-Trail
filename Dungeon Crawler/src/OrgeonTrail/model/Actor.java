/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrgeonTrail.model;

import java.awt.Point;

/**
 *
 * @author MasterCraft Computer
 */
public enum Actor 
{
    
    Bob("Bob", "He is Bob.", new Point(1,1)),
    Shnob("Snob", "He is a Snobb", new Point(2,2));
    
    private final String name;
    private final String description;
    private final Point coordinates;

    Actor(String name, String description, Point coordinates)
        {
        this.name = name;
        this.description = description;
        this.coordinates = coordinates;
        }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    
    
    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", description=" + description + ", coordinates=" + coordinates + '}';
    }

}

