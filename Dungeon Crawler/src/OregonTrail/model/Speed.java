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
public class Speed implements Serializable
{
    
public double setSpeed(String speed) 
{
if ("slow".equals(speed))
    {
    return 1;
    }
if ("normal".equals(speed))
    {
    return 2;
    }
if ("fast".equals(speed))
    {
    return 3;
    }
else
    {
    System.out.println("Please enter a valid speed");
    }
return 0;
}

public double getSpeed(double speed) 
{
return speed;
}

}