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
                + "\nEnter the file name for the game you want to save."
                + "\nOtherwise press Q to exit this view."
                + "\n"
                + "\n---------------------------");
    }
    
    @Override
    public boolean doAction(String inputs) {
        if (inputs.isEmpty()) {
            this.console.println("You must enter a valid file name.");
            return false;
        }
        Game game = OregonTrail.getCurrentGame();

        try {
            GameControl.saveGame(game, inputs);
        } catch (Throwable sgce) {
            this.console.println("ERROR: Saving game: " + sgce.getMessage());
            return false;
        }

        this.console.println("The file was saved with the following file name: " + inputs);

        return true;
    }
    
}
