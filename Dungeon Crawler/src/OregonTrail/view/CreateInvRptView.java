/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.view;

import OregonTrail.control.GameControl;
import java.io.PrintWriter;
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
        if(inputs.isEmpty()) {
            this.console.println("You must enter a valid file name.");
            return false;
        }
        
        try (PrintWriter out = new PrintWriter(inputs)) {
            out.println("\nINVENTORY REPORT");
            out.printf("%n%-15s%-5s","Inventory Item","Qty");
            out.printf("%n%-15s%-5s","--------------","---");
        } catch (Throwable sgce) {
            this.console.println("ERROR: Saving game: " + sgce.getMessage());
            return false;
        }

        this.console.println("The file was saved with the following file name: " + inputs);

        
        return true;
    }
}
