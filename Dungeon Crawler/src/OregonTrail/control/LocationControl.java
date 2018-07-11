/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.control;

import OregonTrail.OregonTrail;
import OregonTrail.model.Map;
import OregonTrail.model.Speed;
import java.util.HashSet;
import java.util.Set;

/*import OregonTrail.model.Speed;*/
/**
 *
 * @author MasterCraft Computer
 */
public class LocationControl {

//    public static double checkLocation(double getRow, double getColumn)
//        {
//        double currentRow = getRow;
//        double currentColumn = getColumn;
//
//        if (currentRow < 0) {
//            return -1;
//        }
//
//        if (currentColumn < 0) {
//            return -1;
//        }
//
//        return 1;
//    }

    public static int changeLocation(int getSpeed) {
        Map map = OregonTrail.getCurrentGame().getMap();
        int row = map.getCurrentRow();
        int column = map.getCurrentColumn();
        int speed = getSpeed;
        int newRow = row + speed;
//        if (column < map.getTotalColumns()-1)
        if (newRow > map.getTotalRows()-1) {
            if (column < map.getTotalColumns()-1){
                newRow = 0;
                column++;
                map.getCurrentLocation().setVisited(Boolean.TRUE);
                map.setCurrentRow(newRow);
                map.setCurrentColumn(column);
                return 1;
            }
           
            return -1;
        } else {
            map.getCurrentLocation().setVisited(Boolean.TRUE);
            map.setCurrentRow(newRow);
            return 1;
        }

    }
}
