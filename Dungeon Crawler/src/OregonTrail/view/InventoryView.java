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
        super("This is your inventory... eventually.");
    }
    @Override
    public boolean doAction (String inputs){
        String menuItem = inputs;
        switch (menuItem.toUpperCase()) {
            default:
                System.out.println("ERROR: Invalid selection. Please try again");
        }
        return false;
        }
        void displayInventoryView() {
        System.out.println("Calls displayInventoryView in IV");
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

    

