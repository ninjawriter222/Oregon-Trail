/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.control;

import OregonTrail.model.AvailableCash;
import OregonTrail.model.Inventory;
import OregonTrail.model.Player;
import exceptions.PurchaseSuppliesException;

/**
 *
 * @author MasterCraft Computer
 */
public class PurchaseSupplies {
    
    public static double purchase(double itemAmmount, double cost) 
    throws PurchaseSuppliesException {
        
        if (itemAmmount < 0 || itemAmmount > 99) {
            throw new PurchaseSuppliesException ("The item amount cannot be less than 0 or greater than 99.");
        }
        
        double purchase = itemAmmount * cost;        
        return purchase;
    }
    
    public static double calculateRemainingCash(Inventory item, Player player) 
    throws PurchaseSuppliesException {
        
        if (item.getAmmount() < 0 || item.getCost() < 0)
            throw new PurchaseSuppliesException ("The item quantity and the item cost cannot be less than 0.");
        
        double remainingCash = (player.getCurrentCash() - purchase(item.getAmmount(), item.getCost()));
        if (remainingCash < 0 || remainingCash > 2000)
            throw new PurchaseSuppliesException ("The cash balance cannot be less than 0 or greater than 2000.");
        else {
            player.setCurrentCash(remainingCash);
            return remainingCash;
        }
    }

//why is it that I need to define the variable when I return the variable of
//purchase just before this function?
}
