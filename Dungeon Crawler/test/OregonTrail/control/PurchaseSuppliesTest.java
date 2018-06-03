/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.control;

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
        System.out.println("purchase");
        double itemAmmount = 0.0;
        double cost = 0.0;
        double expResult = 0.0;
        double result = PurchaseSupplies.purchase(itemAmmount, cost);
        assertEquals(expResult, result, 0.0001);
    }
    @Test
    public void testPurchase1() {
        System.out.println("purchase");
        double itemAmmount = 10;
        double cost = 10;
        double expResult = 100;
        double result = PurchaseSupplies.purchase(itemAmmount, cost);
        assertEquals(expResult, result, 0.0001);
    }
    @Test
    public void testPurchase2() {
        System.out.println("purchase");
        double itemAmmount = 100;
        double cost = 1;
        double expResult = -1;
        double result = PurchaseSupplies.purchase(itemAmmount, cost);
        assertEquals(expResult, result, 0.0001);
    }
    @Test
    public void testPurchase3() {
        System.out.println("purchase");
        double itemAmmount = -1;
        double cost = 0.0;
        double expResult = -1;
        double result = PurchaseSupplies.purchase(itemAmmount, cost);
        assertEquals(expResult, result, 0.0001);
    }
    /**
     * Test of calculateRemainingCash method, of class PurchaseSupplies.
     */
}
