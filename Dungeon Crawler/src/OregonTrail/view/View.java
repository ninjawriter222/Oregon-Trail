/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.view;

import OregonTrail.OregonTrail;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hansm
 */
public abstract class View implements ViewInterface {
   
    protected String promptMessage;
    
    protected final BufferedReader keyboard = OregonTrail.getInFile();
    protected final PrintWriter console = OregonTrail.getOutFile();
    
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
             if (OregonTrail.getCurrentGame().isGameOver()){
                 return;
             }
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
            try {
                inputs = this.keyboard.readLine();
            } catch (IOException ex) {
                ErrorView.display(this.getClass().getName(), ex.getMessage());
            }
//            inputs = keyboard.nextLine().toString();
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