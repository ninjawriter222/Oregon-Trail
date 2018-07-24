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
public class InventoryView extends View {
    
    public InventoryView(){
        super("+++++++++++++++++++++++++++++++++++++++++++++++++++"
            + "\n+               Inventory Menu                    +"
            + "\n+++++++++++++++++++++++++++++++++++++++++++++++++++"
            + "\nThis is your inventory... eventually."
            + "\n"
            + "\n---------------------------------------------"
            + "\n---------------------------------------------"
            + "\nPress C to create a report of your inventory."
            + "\nOtherwise press Q to exit this view.");
    }
    
    @Override
    public boolean doAction (String inputs){
        String menuItem = inputs;
        switch (menuItem.toUpperCase()) {
            case "C":
                createInvRpt();
                return false;
            default:
                this.console.println("ERROR: Invalid selection. Please try again");
        }
        return false;
    }
    
    void displayInventoryView() {
        this.console.println("Calls displayInventoryView in IV");
    }

    private void createInvRpt() {
        CreateInvRptView invRptView = new CreateInvRptView();
        invRptView.display();
    }
}
//    private String displayInvetory;
//
//    public String getDisplayInvetory() {
//        System.out.println("This is your inventory... eventually.");
//        return displayInvetory;
//    }
//
//    public void setDisplayInvetory(String displayInvetory) {
//        this.displayInvetory = displayInvetory;
//    }

    

