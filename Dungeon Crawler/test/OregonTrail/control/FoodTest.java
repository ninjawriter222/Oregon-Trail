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
        
        System.out.println("\tTest 1");
        int invFood = 100;
        int famSize = 5;
        int indvFoodNeed = 8;
        Food instance = new Food();
        int expResult = 60;
        int result = instance.determineFoodBalance(invFood, famSize, indvFoodNeed);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        
        System.out.println("\tTest 2");
        invFood = -1;
        famSize = 5;
        indvFoodNeed = 4;
        expResult = -1;
        result = instance.determineFoodBalance(invFood, famSize, indvFoodNeed);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        
        System.out.println("\tTest 3");
        invFood = 100;
        famSize = -1;
        indvFoodNeed = 8;
        expResult = -2;
        result = instance.determineFoodBalance(invFood, famSize, indvFoodNeed);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        
        System.out.println("\tTest 4");
        invFood = 89;
        famSize = 4;
        indvFoodNeed = -1;
        expResult = -3;
        result = instance.determineFoodBalance(invFood, famSize, indvFoodNeed);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        
        System.out.println("\tTest 5");
        invFood = 76;
        famSize = 3;
        indvFoodNeed = 2;
        expResult = 70;
        result = instance.determineFoodBalance(invFood, famSize, indvFoodNeed);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        
        System.out.println("\tTest 6");
        invFood = 1;
        famSize = 4;
        indvFoodNeed = 5;
        expResult = 0;
        result = instance.determineFoodBalance(invFood, famSize, indvFoodNeed);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        
        System.out.println("\tTest 7");
        invFood = 500;
        famSize = 5;
        indvFoodNeed = 2;
        expResult = 490;
        result = instance.determineFoodBalance(invFood, famSize, indvFoodNeed);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        
        System.out.println("\tTest 8");
        invFood = 20;
        famSize = 2;
        indvFoodNeed = 7;
        expResult = 6;
        result = instance.determineFoodBalance(invFood, famSize, indvFoodNeed);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
        
        System.out.println("\tTest 9");
        invFood = 124;
        famSize = 6;
        indvFoodNeed = 1;
        expResult = 118;
        result = instance.determineFoodBalance(invFood, famSize, indvFoodNeed);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
