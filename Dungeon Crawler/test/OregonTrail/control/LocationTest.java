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
     * Test of checkLocation method, of class Location.
     */
    @Test
    public void testCheckLocation() {
        System.out.println("checkLocation");
        double getRow = 1;
        double getColumn = 5;
        double expResult = 1.0;
        double result = Location.checkLocation(getRow, getColumn);
        assertEquals(expResult, result, 0.0001);
        
    }
    
    /**
     * Test of checkLocation method, of class Location.
     */
    @Test
    public void testCheckLocation1() {
        System.out.println("checkLocation");
        double getRow = -5;
        double getColumn = 0;
        double expResult = -1;
        double result = Location.checkLocation(getRow, getColumn);
        assertEquals(expResult, result, 0.0001);
        
    }

    /**
     * Test of changeLocation method, of class Location.
     */
    @Test
    public void testChangeLocation() {
        System.out.println("changeLocation");
        double getRow = 5.0;
        double getColumn = 5.0;
        double Speed = 3.0;
        double expResult = 1.0;
        double result = Location.changeLocation(getRow, getColumn, Speed);
        assertEquals(expResult, result, 0.0001);
        
    }
    
    /**
     * Test of changeLocation method, of class Location.
     */
    @Test
    public void testChangeLocation1() {
        System.out.println("changeLocation");
        double getRow = 5.0;
        double getColumn = 5.0;
        double Speed = 0.0;
        double expResult = 1;
        double result = Location.changeLocation(getRow, getColumn, Speed);
        assertEquals(expResult, result, 0.0001);
        
    }
    
    
}
