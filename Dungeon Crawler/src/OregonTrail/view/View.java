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
   
    protected String promptMessage;
    
    public View(String message){
        this.promptMessage = message;
        
    }
    
    @Override
    public void display() {
        boolean endOfView = false;
        String inputs = "";
        do {
            inputs = getInputs();
            if (inputs == null || "Q".equals(inputs.toUpperCase())) {
                return;
            }
            endOfView = doAction(inputs);
        } while (!endOfView);
    }
    @Override
    public String getInputs(){
      return getInput(promptMessage);  
    }
    /**
     *
     * @return
     */
    @Override
    public String getInput(String menuText) {
        String inputs = "";
        boolean valid = false;
        do {
            System.out.println(menuText);
            Scanner keyboard = new Scanner(System.in);
            inputs = keyboard.nextLine().toString();
            if (inputs.length() < 1) {
                System.out.println("ERROR: Your input must be longer than 1 "
                        + "character.");
                valid = false;
            } else {
                valid = true;
            }
        } while (!valid);
        return inputs;
    }
}