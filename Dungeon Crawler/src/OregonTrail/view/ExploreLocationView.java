/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.view;

import OregonTrail.OregonTrail;
import OregonTrail.control.GameControl;

/**
 *
 * @author hansm
 */
public class ExploreLocationView extends View {

    public ExploreLocationView() {
        super("+++++++++++++++++++++++++++++++++++++++++++++++++++"
                + "\n                    Welcome to                     "
                + "\n             " + "SOME SCENE NAME" + "             "
                + "\n+++++++++++++++++++++++++++++++++++++++++++++++++++"
                + "\n"
                + "This is a " + "NEW/VISITED" + " location to you."
                + "Here you can find " + "SOME RESOURCE" + "."
                + "\n"
                + "\nIf you would like to talk to " + "SOME CHARACTER"
                + "\ntype the letter 'Y'. Otherwise, press 'N'."
                + "\n"
                + "\n---------------------------");
    }
    
    @Override
    public void display(){
    }
    
    public String[] getInputs(String[] inputs) {
        return inputs;
    }
    
    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
        
        if (menuItem.toUpperCase() == "Y") {
            viewCharDialogue();
            return false;
        } else if (menuItem.toUpperCase() == "N") {
            return true;
        } else (menuItem.toUpperCase() != "Y") {
            System.out.println("ERROR: Invalid selection. Please try again");
        }
        return false;
    }
    
    private void viewCharDialogue() {
        System.out.println("***Calls the viewCharDialogue method in CharDialogueV***");
        GameControl.createNewGame(OregonTrail.getPlayer());
        
        CharDialogueView charDialogueView = new CharDialogueView();
        charDialogueView.display();
    }
    
}
