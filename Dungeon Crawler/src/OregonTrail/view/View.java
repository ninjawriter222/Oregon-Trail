/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.view;

import java.util.Scanner;

/**
 *
 * @author hansm
 */
public abstract class View implements ViewInterface {
    
    @Override
    public void display() {
        boolean endOfView = false;
        String[] inputs = null;
        do {
            inputs = getInputs();
            if (inputs[0] == null || "Q".equals(inputs[0].toUpperCase())) {
                return;
            }
            endOfView = doAction(inputs);
        } while (!endOfView);
    }
    
    protected String displayMessage;
    
    public View(String message) {
        this.displayMessage = message;
    }
    
    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];
        System.out.println(displayMessage);
        boolean valid = false;
        do {
            System.out.println("Please enter in your characters name.");
            Scanner keyboard = new Scanner(System.in);
            inputs[0] = keyboard.nextLine().toString();
            if (inputs[0].length() < 1) {
                System.out.println("ERROR: Your name must be longer than 1 "
                        + "character.");
                valid = false;
            } else {
                valid = true;
            }
        } while (!valid);
        return inputs;
    }
}