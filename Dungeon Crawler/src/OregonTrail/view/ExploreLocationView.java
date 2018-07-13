/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.view;

import OregonTrail.OregonTrail;
import OregonTrail.control.GameControl;
import OregonTrail.model.Actor;

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
    public boolean doAction(String inputs) {
        String menuItem = inputs;
        switch (menuItem.toUpperCase()) {
            case "Y":
                showCharDialogue();
                return false;
            case "N":
                return true;
            default:
                this.console.println("ERROR: Invalid selection. Please try again");
        }
        return false;
    }
    
    private void showCharDialogue() {
        this.console.println("***Calls the dialogue for a character in the Model Layer***");
    }
    
}
