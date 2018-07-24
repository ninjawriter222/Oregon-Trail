/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.view;

/**
 *
 * @author MasterCraft Computer
 */
public class PurchaseSuppliesView extends View {
    private String purchaseSuppliesView;

    public PurchaseSuppliesView(){
        super("+++++++++++++++++++++++++++++++++++++++++++++++++++"
            + "\n+            Purchase Supplies Menu               +"
            + "\n+++++++++++++++++++++++++++++++++++++++++++++++++++"
            + "\nHere you can purchase any supplies you many need"
            + "\nwhile on your trip. Remember, you have a max of "
            + "\n500 pounds."
            + "\n"
            + "\nBelow is a list of what is available. Press the "
            + "\ncorresponding letter for the item you would like"
            + "\nto purchase."
            + "\n---------------------------------------------"
            + "\nF - Food: " + "QTY STUB"
            + "\nC - Clothing: " + "QTY STUB"
            + "\nA - Axe: " + "QTY STUB"
            + "\nW - Wheel: " + "QTY STUB"
            + "\nX - Axel: " + "QTY STUB"
            + "\nM - Ammunition: " + "QTY STUB"
            + "\n"
            + "\nPress Q to exit this menu.");
    }
    
    
    public String getPurchaseSuppliesView() {
        return purchaseSuppliesView;
    }

    public void setPurchaseSuppliesView(String purchaseSuppliesView) {
        this.purchaseSuppliesView = purchaseSuppliesView;
    }

    void displayPurchaseSuppliesView() {
        System.out.println("Calls displayPurchaseSuppliesView in PSV");
    }

    @Override
    public boolean doAction (String inputs){
        String menuItem = inputs;
        switch (menuItem.toUpperCase()) {
            case "F":
            case "C":
            case "A":
            case "W":
            case "X":
            case "M":
                qtyDecision();
                return false;
            default:
                this.console.println("ERROR: Invalid selection. Please try again");
        }
        return false;
    }

    private void qtyDecision() {
        QtyDecisionView qtyDecView = new QtyDecisionView();
        qtyDecView.display();
    }
    
}
