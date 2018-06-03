/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hansm
 */
public class FoodTest {
    
    public FoodTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of determineFoodBalance method, of class Food.
     */
    @Test
    
    public void testDetermineFoodBalance() {
        System.out.println("determineFoodBalance");
        int invFood = 100;
        int famSize = 5;
        int indvFoodNeed = 8;
        Food instance = new Food();
        int expResult = 60;
        int result = instance.determineFoodBalance(invFood, famSize, indvFoodNeed);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
