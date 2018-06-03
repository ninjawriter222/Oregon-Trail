/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.control;


import static OregonTrail.control.PurchaseSupplies.purchase;
import OrgeonTrail.model.AvailableCash;
/**
 *
 * @author MasterCraft Computer
 */
public class PurchaseSupplies 
{
double AvailableCash;
double itemAmmount;
double cost;
double total = 0;
double remaingCash;

public void setCash (double AvaliableCash) 
    {
    this.setCash(AvaliableCash);
    }   

public static double purchase(double itemAmmount, double cost)
    {
    if(itemAmmount < 0 || itemAmmount > 99)
        {
        return -1;
        }
    
    double purchase = itemAmmount * cost; 
    return purchase;
    }

public static double calculateRemainingCash()
    {
    double remainingCash = (AvailableCash - purchase);
    if (remainingCash < 0 || remainingCash > 2000)
        {
        return -1;
        }
    else
        {
        return RemainingCash;
        }
    }
 


//why is it that I need to define the variable when I return the variable of
//purchase just before this function?

}
