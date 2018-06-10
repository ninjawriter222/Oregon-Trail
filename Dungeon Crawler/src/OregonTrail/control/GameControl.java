/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.control;

import OregonTrail.OregonTrail;
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
    public static void createNewGame(Player player){
        System.out.println("***Calls createNewGame method in GC***");
    }
}
