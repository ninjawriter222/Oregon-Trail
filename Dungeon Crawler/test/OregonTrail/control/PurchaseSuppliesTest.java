/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.control;

import OregonTrail.model.Inventory;
import OregonTrail.model.Player;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MasterCraft Computer
 */
public class PurchaseSuppliesTest {
    /**
     * Test of purchase method, of class PurchaseSupplies.
     */
    @Test
    public void testPurchase0() {
        System.out.println("purchase 1");
        double itemAmmount = 0.0;
        double cost = 0.0;
        double expResult = 0.0;
        double result = PurchaseSupplies.purchase(itemAmmount, cost);
        assertEquals(expResult, result, 0.0001);
    
        System.out.println("purchase 2");
        itemAmmount = 10;
        cost = 10;
        expResult = 100;
        result = PurchaseSupplies.purchase(itemAmmount, cost);
        assertEquals(expResult, result, 0.0001);
   
        System.out.println("purchase 3");
        itemAmmount = 100;
        cost = 1;
        expResult = -1;
        result = PurchaseSupplies.purchase(itemAmmount, cost);
        assertEquals(expResult, result, 0.0001);
    
        System.out.println("purchase 4");
        itemAmmount = -1;
        cost = 0.0;
        expResult = -1;
        result = PurchaseSupplies.purchase(itemAmmount, cost);
        assertEquals(expResult, result, 0.0001);
    }
    @Test
    public void testCalculateRemainingCash() {
        Inventory item = new Inventory();
        Player player = new Player();
        System.out.println("test 1");
        item.setAmmount(1);
        item.setCost(10);
        player.setCurrentCash(1000);
        double expResult = 990;
        double result = PurchaseSupplies.calculateRemainingCash(item, player);
        System.out.println("Result = " + result);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("test 1");
        item.setAmmount(1);
        item.setCost(-10);
        player.setCurrentCash(1000);
        expResult = -2;
        result = PurchaseSupplies.calculateRemainingCash(item, player);
        System.out.println("Result = " + result);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("test 1");
        item.setAmmount(-1);
        item.setCost(10);
        player.setCurrentCash(1000);
        expResult = -2;
        result = PurchaseSupplies.calculateRemainingCash(item, player);
        System.out.println("Result = " + result);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("test 1");
        item.setAmmount(1);
        item.setCost(10);
        player.setCurrentCash(-100);
        expResult = -1;
        result = PurchaseSupplies.calculateRemainingCash(item, player);
        System.out.println("Result = " + result);
        assertEquals(expResult, result, 0.0001);
    }
    /**
     * Test of calculateRemainingCash method, of class PurchaseSupplies.
     */
}
