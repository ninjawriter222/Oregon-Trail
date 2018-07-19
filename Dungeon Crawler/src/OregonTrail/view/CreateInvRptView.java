/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.view;

import static java.lang.System.out;

/**
 *
 * @author hansm
 */
public class CreateInvRptView extends View {
    public CreateInvRptView() {
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
        String filePath = this.getInputs();
            out.println("\nINVENTORY REPORT");
            out.printf("%n%-15s%-5s","Inventory Item","Qty");
        return false;
    }
}
