/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.view;

import OregonTrail.OregonTrail;
import OregonTrail.control.GameControl;
import OregonTrail.model.Player;

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
    public void display() {
    }

    public String[] getInputs(String[] inputs) {
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        switch (menuItem.toUpperCase()) {
            case "N":
                this.startNewGame();
                return false;
            case "R":
                restartGame();
                return false;
            case "H":
                getHelp();
            case "E":
                return true;
            default:
                System.out.println("ERROR: Invalid selection. Please try again");
        }
        return false;
    }

    private void startNewGame() {
        GameControl.createNewGame(OregonTrail.getPlayer());
        Player instance = new Player();
            instance.setHealth(100);
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }

    private void restartGame() {
        System.out.println("***Calls the restartGame method in MMV***");
        
        StartExistingGameView instance = new StartExistingGameView();
        instance.displayStartExistingGameView();
    }

    private void getHelp() {
        HelpMenuView instance = new HelpMenuView();
        instance.displayHelpMenuView();
    }
}
