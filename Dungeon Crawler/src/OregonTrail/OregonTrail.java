/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail;

import OregonTrail.control.GameControl;
import OregonTrail.control.PlayerHealth;
import OregonTrail.model.Player;
import OregonTrail.view.StartProgramView;
import OregonTrail.model.Game;
import OregonTrail.view.GameMenuView;
import OregonTrail.view.ViewInterface;
import OregonTrail.view.View;


/**
 *
 * @author MasterCraft Computer
 */
public class OregonTrail {
    
    private static Player player = null;
    private static Game currentGame = null;
    
    public static void main(String[] args) {
        
        try {
            
        } catch () {
            System.out.println();
            return false;
        }
        return true;
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
        
//        GameControl.createNewGame(getPlayer());
        
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        OregonTrail.player = player;
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        OregonTrail.currentGame = currentGame;
    }
}
