/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.view;

import OregonTrail.OregonTrail;
import OregonTrail.control.GameControl;
import OregonTrail.model.Game;
import OregonTrail.model.Player;
import exceptions.OregonTrailException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MasterCraft Computer
 */
public class MainMenuView extends View {

    public MainMenuView() {
        super("+++++++++++++++++++++++++++++++++++++++++++++++++++"
                + "\n+             This is the Main Menu               +"
                + "\n+++++++++++++++++++++++++++++++++++++++++++++++++++"
                + "\nType the letter corresponding"
                + "\nto the option/action you want"
                + "\nto take."
                + "\n"
                + "\nN - Press N to start a new game"
                + "\nR - Press R to restart your game"
                + "\nH - Press H to get help on the game"
                + "\nE - Press E to exit"
                + "\n---------------------------");
    }

    @Override
    public boolean doAction(String inputs) {
        String menuItem = inputs;
        switch (menuItem.toUpperCase()) {
            case "N":
                this.startNewGame();
                return false;
            case "R":
                restartGame();
                return false;
            case "E":
                return true;
            default:
                this.console.println("ERROR: Invalid selection. Please try again");
        }
        return false;
    }

    private void startNewGame() {
        GameControl.createNewGame(OregonTrail.getPlayer());
           Game game = new Game();
           OregonTrail.getPlayer().setHealth(100);
        GameMenuView gameMenuView = new GameMenuView();
            gameMenuView.display();
    }

    private void restartGame() {
//        this.console.println("***Calls the restartGame method in MMV***");
        String filename = getInput("Please enter the file name to be loaded.");
        try {
            Game game = GameControl.getGame(filename);
            OregonTrail.setCurrentGame(game);
            GameMenuView gameMenuView = new GameMenuView();
            gameMenuView.display();
        } catch (OregonTrailException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
        
//        instance.display();
    }

}
