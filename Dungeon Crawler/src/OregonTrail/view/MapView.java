/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.view;

import OregonTrail.OregonTrail;
//import OregonTrail.control.MapControl;
import OregonTrail.model.Game;
import OregonTrail.model.Location;
import OregonTrail.model.Map;

/**
 *
 * @author hansm
 */
public class MapView {
    void displayMapView() {
  String leftIndicator;
  String rightIndicator;
  Game game = OregonTrail.getCurrentGame(); // retreive the game
  Map map = game.getMap(); // retreive the map from game
  Location[][] locations = map.getLocations(); // retreive the locations from map
    // Build the heading of the map
    this.console.print("  |");
    for( int column = 0; column < locations[0].length; column++){
      // print col numbers to side of map
      this.console.print("  " + column + " |"); 
    }
    // Now build the map.  For each row, show the column information
    this.console.println();
    for( int row = 0; row < locations.length; row++){
     this.console.print(row + " "); // print row numbers to side of map
      for( int column = 0; column < locations[row].length; column++){
        // set default indicators as blanks
        leftIndicator = " ";
        rightIndicator = " ";
        if(locations[row][column] == map.getCurrentLocation()){
          // Set star indicators to show this is the current location.
          leftIndicator = "*"; 
          rightIndicator = "*"; 
        } 
        else if(locations[row][column].getVisited()){
           // Set < > indicators to show this location has been visited.
           leftIndicator = ">"; // can be stars or whatever these are indicators showing visited
           rightIndicator = "<"; // same as above
        }
       this.console.print("|"); // start map with a |
        if(locations[row][column].getScene() == null)
        {
             // No scene assigned here so use ?? for the symbol
             this.console.print(leftIndicator + "??" + rightIndicator);
        }
        else
          this.console.print(leftIndicator
             + locations[row][column].getScene().getMapSymbol()
             + rightIndicator);
      }
     this.console.println("|");
    }
 }
    
//    }
//    public long navMap(int[][] daMap, int i){
//        long total = 0;
//        for (int[] daMap1 : daMap) {
//            System.out.println("-------------------------------------");
//        }
//            for (int j=0; j < daMap[i].length; j++){
//                System.out.println("|" + i + "," + j + "|");
//                total += daMap[i][j];
//            }
//        return total;
//    }
}        



