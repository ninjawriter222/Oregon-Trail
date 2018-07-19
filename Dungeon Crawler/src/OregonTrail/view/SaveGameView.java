/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.view;

import OregonTrail.OregonTrail;
import OregonTrail.control.GameControl;
import OregonTrail.model.Game;
import exceptions.SaveGameControlException;
/**
 *
 * @author MasterCraft Computer
 */
public class SaveGameView extends View {

    public SaveGameView() {
        super("+++++++++++++++++++++++++++++++++++++++++++++++++++"
                + "\n+        Would you like to save the game?         +"
                + "\n+++++++++++++++++++++++++++++++++++++++++++++++++++"
                + "\n"
                + "\nPress Y to save the game. Otherwise press Q to exit this view."
                + "\n"
                + "\n---------------------------");
    }
    
    @Override
    public boolean doAction(String inputs) {
        String menuItem = inputs;
        switch (menuItem.toUpperCase()) {
            case "Y":
                this.saveGame();
                return true;
            default:
                System.out.println("ERROR: Invalid selection. Please try again");
        }
        return false;
    }

    private boolean saveGame() {
        Game game = OregonTrail.getCurrentGame();
            
                try {
                    GameControl.saveGame(game, promptMessage);
                } catch (Throwable sgce) {
                    this.console.println("ERROR: Current game" + sgce);
                    return false;
                }
                
                this.console.println("The file was saved with the following file name:" + "SOME FILENAME");
                
            return true;
                
                
    }
    
}
