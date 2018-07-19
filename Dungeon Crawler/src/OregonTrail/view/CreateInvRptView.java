/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.view;

/**
 *
 * @author hansm
 */
public class CreateInvRptView extends View {
    public CreateInvRptView {
        super("+++++++++++++++++++++++++++++++++++++++++++++++++++"
                + "\n+                Print Inventory                  +"
                + "\n+++++++++++++++++++++++++++++++++++++++++++++++++++"
                + "\n"
                + "\nEnter a name for the file you will save."
                + "\nOtherwise, press Q to exit."
                + "\n"
                + "\n-----------------------------------");
    }

    @Override
    public boolean doAction(String inputs) {
        String menuItem = inputs;
        switch (menuItem.toUpperCase()) {
            case "C":
                viewMap();
                return false;
            default:
                this.console.println("ERROR: Invalid selection. Please try again");
        }
        return false;
    }
}
