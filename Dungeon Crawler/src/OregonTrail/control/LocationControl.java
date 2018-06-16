/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.control;

import OregonTrail.model.Speed;

/*import OregonTrail.model.Speed;*/
/**
 *
 * @author MasterCraft Computer
 */
public class LocationControl {

    public static double checkLocation(double getRow, double getColumn) {
        double currentRow = getRow;
        double currentColumn = getColumn;

        if (currentRow < 0) {
            return -1;
        }

        if (currentColumn < 0) {
            return -1;
        }

        return 1;
    }

    public static double changeLocation(double getRow, double getColumn, double getSpeed) {
        double row = getRow;
        double column = getColumn;
        double speed = getSpeed;
        double newRow = row + speed;

        if (newRow > 4) {
            newRow = 0;
            column = +1;
            return column;
        } else {
            return newRow;
        }

    }
}
