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
public class QtyDecisionView extends View {
    public QtyDecisionView() {
        super("How much of the following item would you like to purchase?:"
            + "\nUSER SELECTION."
            + "\nPlease remember, what you carry cannot exceed 500 lbs.");
    }

    @Override
    public boolean doAction(String inputs) {
        this.console.println("Coming soon!");
        return true;
    }
}
