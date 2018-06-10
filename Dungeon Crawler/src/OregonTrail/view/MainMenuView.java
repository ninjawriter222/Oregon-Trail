/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.view;

import OregonTrail.OregonTrail;
import OregonTrail.control.GameControl;
import OregonTrail.model.Player;
import java.util.Scanner;

/**
 *
 * @author MasterCraft Computer
 */
class MainMenuView {

    public MainMenuView() {

    }

    void display() {
        boolean endView = false;
        String[] inputs = null;
        do {
            inputs = getInputs();
            if (inputs[0] == null || "Q".equals(inputs[0].toUpperCase())) {
                return;
            } else {
                endView = doAction(inputs);
            }
        } while (!endView);
    }

    private String[] getInputs() {
        String[] inputs = new String[1];
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++"
                + "\n+             This is the main Menu               +"
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
        boolean valid = false;
        do {
            System.out.println("Please enter in your selection");
            Scanner keyboard = new Scanner(System.in);
            inputs[0] = keyboard.nextLine().toString();
            if (inputs[0].length() < 1) {
                System.out.println("ERROR: Your selction must be longer than 1"
                        + " character.");
                valid = false;
            } else {
                valid = true;
            }
        } while (!valid);
        return inputs;
    }

    private boolean doAction(String[] inputs) {
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
                System.out.println("ERROR: Invalid selection, Please try again");
        }
        return false;
    }

    private void startNewGame() {
        System.out.println("***Calls the startNewGame method in MMV***");
        GameControl.createNewGame(OregonTrail.getPlayer());
        
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displaygGameMenuView();
        
    }

    private void restartGame() {
        System.out.println("***Calls the restartGame method in MMV***");
        
        StartExistingGameView instance = new StartExistingGameView();
        instance.displayStartExistingGameView();
    }

    private void getHelp() {
        HelpMenuView instance = new HelpMenuView();
        instance.displaygHelpMenuView();
    }
}
