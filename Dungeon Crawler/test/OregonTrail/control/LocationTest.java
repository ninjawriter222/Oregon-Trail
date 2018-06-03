/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.control;

import OrgeonTrail.model.Speed;
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
        double getRow = 0.0;
        double getColumn = 0.0;
        double expResult = 0.0;
        double result = Location.checkLocation(getRow, getColumn);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of changeLocation method, of class Location.
     */
    @Test
    public void testChangeLocation() {
        System.out.println("changeLocation");
        Speed speed = null;
        double getRow = 0.0;
        double getColumn = 0.0;
        double Speed = 0.0;
        double expResult = 0.0;
        double result = Location.changeLocation(speed, getRow, getColumn, Speed);
        assertEquals(expResult, result, 0.0);
    }
    
}
