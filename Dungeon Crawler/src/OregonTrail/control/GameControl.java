/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.control;

import OregonTrail.OregonTrail;
import OregonTrail.control.PlayerHealth;
import OregonTrail.model.Player;

/**
 *
 * @author MasterCraft Computer
 */
public class GameControl {

    public static Player savePlayer(String name) {
        if(name == null || name.length() < 1){
            return null;
        }
        else{
        Player player = new Player();
        OregonTrail.setPlayer(player);
        return new Player();
        }
    }
    
//    public static int createNewGame(Player player) {
//        if (player == null)
//            return -1
//                    
//        game = create a new Game object
//        Save a reference to the Player object in the game
//        Save a reference to the game in the main class
//                
//        actors = createActors()
//        Save the list of actors in the Game object
//        Assign an actor to the player
//                
//        items = createItems()
//        Save the list of items in the game
//                
//        map = createMap(noOfRows, noOfColumns, items)
//        IF map == null THEN
//            RETURN -1
//        ENDIF
//                
//        Assign the map to the game
//        RETURN 1 // indicates success
//    }
    
    public static void createNewGame(Player player){
        
        public static InventoryItem[] createItems() {
            System.out.println("***The createItems method has been called***");
        }
        
//    public static int createNewGame(Player player) {
//        if (player == null)
//            return -1
//                    
//        game = create a new Game object
//        Save a reference to the Player object in the game
//        Save a reference to the game in the main class
//                
//        actors = createActors()
//        Save the list of actors in the Game object
//        Assign an actor to the player
//                
//        items = createItems()
//        Save the list of items in the game
//                
//        map = createMap(noOfRows, noOfColumns, items)
//        IF map == null THEN
//            RETURN -1
//        ENDIF
//                
//        Assign the map to the game
//        RETURN 1 // indicates success
//    }
    }
}
