/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.control;

import OregonTrail.model.Player;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author Nicolas Vega
 */
public class HealthTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of checkSpeed method, of class Health.
     */
    @Test
    public void testCheckSpeed() {
        System.out.println("checkSpeed 1");
        double getSpeed = 0;
        double expResult = -1;
        double result = PlayerHealth.checkSpeed(getSpeed);
        assertEquals(expResult, result, 0.000001);
        // TODO review the generated test code and remove the default call to fail.
    }
 @Test
    public void testCheckSpeed2() {
        System.out.println("checkSpeed 2");
        double getSpeed = 4;
        double expResult = -1;
        double result = PlayerHealth.checkSpeed(getSpeed);
        assertEquals(expResult, result, 0.000001);
    }
     @Test
    public void testCheckSpeed3() {
        System.out.println("checkSpeed 3");
        double getSpeed = 3;
        double expResult = 15;
        double result = PlayerHealth.checkSpeed(getSpeed);
        assertEquals(expResult, result, 0.000001);
    }@Test
    public void testCheckSpeed4() {
        System.out.println("checkSpeed 4");
        double getSpeed = 1;
        double expResult = 5;
        double result = PlayerHealth.checkSpeed(getSpeed);
        assertEquals(expResult, result, 0.000001);
    }   // TODO review the generated test code and remove the default call to fail.
    /**
     * Test of checkRest method, of class Health.
     */
    @Test
    public void testCheckRest() {
        System.out.println("checkRest");
        boolean rest = false;
        double expResult = 0.0;
        double result = PlayerHealth.checkRest(rest);
        assertEquals(expResult, result, 0.00001);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testCheckRest2() {
        System.out.println("checkRest 2");
        boolean rest = true;
        double expResult = 20;
        double result = PlayerHealth.checkRest(rest);
        assertEquals(expResult, result, 0.00001);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
