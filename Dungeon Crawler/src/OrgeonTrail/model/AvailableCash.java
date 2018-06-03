/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrgeonTrail.model;

/**
 *
 * @author MasterCraft Computer
 */
public class AvailableCash 
{

public double setProfession(String profession) 
{
if ("farmer".equals(profession))
    {
    return 1000;
    }
if ("accountant".equals(profession))
    {
    return 1500;
    }
if ("lawer".equals(profession))
    {
    return 2000;
    }
else
    {
    System.out.println("Please enter a valid profession");
    }
return 0;
}

public double getAvailableCash(double AvailableCash) 
{
return AvailableCash;
}

}
