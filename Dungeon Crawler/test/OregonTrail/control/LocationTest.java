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
public class LocationTest {
    
    public LocationTest() {
    }

    /**
     * Test of checkLocation method, of class LocationControl.
     */
    @Test
    public void testCheckLocation0() {
        System.out.println("checkLocation");
        double getRow = -1;
        double getColumn = 1;
        double expResult = -1;
        double result = LocationControl.checkLocation(getRow, getColumn);
        assertEquals(expResult, result, 0.0001);
    }
    @Test
    public void testCheckLocation1() {
        System.out.println("checkLocation");
        double getRow = 1;
        double getColumn = -1;
        double expResult = -1;
        double result = LocationControl.checkLocation(getRow, getColumn);
        assertEquals(expResult, result, 0.0001);
    }
    @Test
    public void testCheckLocation2() {
        System.out.println("checkLocation");
        double getRow = 1;
        double getColumn = 1;
        double expResult = 1;
        double result = LocationControl.checkLocation(getRow, getColumn);
        assertEquals(expResult, result, 0.0001);
    }
    /**
     * Test of changeLocation method, of class LocationControl.
     */
    @Test
    public void testChangeLocation0() {
        System.out.println("changeLocation");
        double getRow = 1;
        double getColumn = 1;
        double speed = 1;
        double expResult = 2;
        double result = LocationControl.changeLocation(getRow, getColumn, speed);
        assertEquals(expResult, result, 0.0001);
    }
    
}
