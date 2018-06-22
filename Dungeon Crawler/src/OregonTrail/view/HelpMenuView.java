/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.view;

import java.util.Scanner;

/**
 *
 * @author MasterCraft Computer
 */
public class HelpMenuView {

    public void displayHelpMenuView() {
        boolean endOfView = false;
        String[] inputs = null;
        do {
            inputs = getInputs();
            if (inputs[0] == null || "Q".equals(inputs[0].toUpperCase())) {
                return;
            } else {
                endOfView = doAction(inputs);
            }
        } while (!endOfView);
    }
        
    private String[] getInputs() {
        boolean endOfView = false;
        boolean valid = false;
        String[] inputs = new String[1];
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++"
                + "\n+             This is the HELP Menu               +"
                + "\n+++++++++++++++++++++++++++++++++++++++++++++++++++"
                + "\nType the letter corresponding"
                + "\nto the option/action you want"
                + "\nto take."
                + "\n"
                + "\nG - Press G to see what is the goal of the game?"
                + "\nM - Press M to see how to move."
                + "\nE - Press E to see an estimate of how many resources you "
                + "might need"
                + "\nR - Press R to learn how to use your resources."
                + "\nQ - Press Q to Quit"
                + "\n"
                + "\n---------------------------");
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
            case "G":
                this.helpGoal();
                return false;
            case "M":
                this.helpMove();
                return false;
            case "E":
                this.helpEstimate();
                return false;
            default:
                System.out.println("ERROR: Invalid selection, Please try again");
        }
        return false;
    }

    private void helpGoal() {
        System.out.println("The Goal of the game is to reach Oregon.  You must "
                + "\ntrek through dangerous and untamed country in order to do so;"
                + "\nfighting off starvation and sickness and many other obstacles"
                + "\nthat might come your way.");
    }

    private void helpMove() {
        System.out.println("In order to move you simply select move by typeing "
                + "\nin move and then type in your speed, whether it be slow, "
                + "\nnormal, or fast.");    
    }

    private void helpEstimate() {
        System.out.println("You'll need some resources to make it to Oregon. "
                + "\nMore info to come.");   
    }

        

}
