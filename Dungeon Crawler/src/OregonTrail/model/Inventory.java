/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.model;

import java.io.Serializable;

/**
 *
 * @author MasterCraft Computer
 */
public class Inventory implements Serializable
{
    private double cost;
    private int ammount;
  // create additional properties such as type
    /**
     * Get the value of ammount
     *
     * @return the value of ammount
     */
    public int getAmmount() {
        return ammount;
    }

    /**
     * Set the value of ammount
     *
     * @param ammount new value of ammount
     */
    public void setAmmount(int ammount) {
        this.ammount = ammount;
    }
    
    /**
     * Get the value of cost
     *
     * @return the value of cost
     */
    public double getCost() {
        return cost;
    }

    /**
     * Set the value of cost
     *
     * @param cost new value of cost
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

}
