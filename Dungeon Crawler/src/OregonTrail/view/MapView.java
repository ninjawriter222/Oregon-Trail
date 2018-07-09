/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.view;

import OregonTrail.control.MapControl;
import OregonTrail.model.Game;
import OregonTrail.model.Location;
import OregonTrail.model.Map;

/**
 *
 * @author hansm
 */
public class MapView {
    void displayMapView() {
        Game instance  = new Game();
        instance.getMap();   
    }
    public long navMap(int[][] daMap, int i){
        long total = 0;
        for (int[] daMap1 : daMap) {
            System.out.println("-------------------------------------");
        }
            for (int j=0; j < daMap[i].length; j++){
                System.out.println("|" + i + "," + j + "|");
                total += daMap[i][j];
            }
        return total;
    }
}        


