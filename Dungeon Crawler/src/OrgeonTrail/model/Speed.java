/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrgeonTrail.model;

import java.io.Serializable;

/**
 *
 * @author MasterCraft Computer
 */
public class Speed implements Serializable
{
private String speed;
double slow = 1;
double normal = 2;
double fast = 3;

    public String setSpeed(String speed) 
    {
    if (speed == "slow")
        {
        this.speed = slow;
        return speed;
        }
    if (speed == "normal")
        {
        this.speed = speed;
        }
    if (speed == "fast")
        {
        this.setFast(3);
        }
    else
        {
        System.out.println("Please enter a valid speed");
        }
    }
    


    public double getSpeed(double speed) 
    {
    return speed;
    }

    public void setSpeed(double speed) 
    {
        
    }

    public double getSlow() {
        return 1;
}

    public void setSlow(double slow) {
        this.slow = 1;
    }

    public double getNormal() {
        return 2;
    }

    public void setNormal(double normal) {
        this.normal = 2;
    }

    public double getFast() {
        return 3;
    }

    public void setFast(double fast) {
        this.fast = 3;
    }


}
