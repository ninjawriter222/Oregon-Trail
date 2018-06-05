/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.control;

import OrgeonTrail.model.AvailableCash;
import OrgeonTrail.model.Inventory;
import OrgeonTrail.model.Player;

/**
 *
 * @author MasterCraft Computer
 */
public class PurchaseSupplies {
    
    public static double purchase(double itemAmmount, double cost) {
        if (itemAmmount < 0 || itemAmmount > 99) {
            return -1;
        }
        
        double purchase = itemAmmount * cost;        
        return purchase;
    }
    
    public static double calculateRemainingCash(Inventory item, Player player) {
        if (item.getAmmount() < 0 || item.getCost() < 0)
            return -2;
        
        double remainingCash = (player.getCurrentCash() - purchase(item.getAmmount(), item.getCost()));
        if (remainingCash < 0 || remainingCash > 2000)
            return -1;
        else {
            player.setCurrentCash(remainingCash);
            return remainingCash;
        }
    }

//why is it that I need to define the variable when I return the variable of
//purchase just before this function?
}
