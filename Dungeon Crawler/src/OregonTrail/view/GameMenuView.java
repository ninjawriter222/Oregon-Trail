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
 * @author MasterCraft Computer
 */
public class GameMenuView extends View {
    
    public GameMenuView() {
        super("+++++++++++++++++++++++++++++++++++++++++++++++++++"
                + "\n+                   Game Menu                     +"
                + "\n+++++++++++++++++++++++++++++++++++++++++++++++++++"
                + "\nType the letter corresponding to the option/action"
                + "\nyou want to take."
                + "\n"
                + "\nV - Press V to view the map"
                + "\nI - Press I to view your inventory"
                + "\nP - Press P to purchase new supplies"
                + "\nL - Press L to explore a new location"
                + "\nM - Press M to move to a new location"
                + "\nE - Press E to Estimate the resources needed"
                + "\nB - Press B to Repair your wagon"
                + "\nC - Press C to Utilize your tools"
                + "\nD - Press D to deal with a sickness"
                + "\nN - Press N to navigate terrain"
                + "\nG - Press G to hunt for resources"
                + "\nS - Press S to save the game"
                + "\nH - Press H to open the Help menu"
                + "\nQ - Press Q to quit"
                + "\n---------------------------");
    }
    
    @Override
    public boolean doAction(String inputs) {
        String menuItem = inputs;
        switch (menuItem.toUpperCase()) {
            case "V":
                viewMap();
                return false;
            case "I":
                viewInventory();
                return false;
            case "P":
                purchaseSupplies();
                return false;
            case "L":
                exploreLoc();
                return false;
            case "M":
                move();
                return false;
            case "E":
                estimateRes();
                return false;
            case "B":
                repairWagon();
                return false;
            case "C":
                useTools();
                return false;
            case "D":
                fixSickness();
                return false;
            case "N":
                navigate();
                return false;
            case "G":
                huntRes();
                return false;
            case "S":
                saveGame();
                return false;
            case "H":
                getHelp();
                return false;
            default:
                this.console.println("ERROR: Invalid selection. Please try again");
        }
        return false;
    }
    
    private void viewMap() {
        MapView mapView = new MapView();
        mapView.displayMapView();
    }
    
    private void viewInventory() {
        this.console.println("***Calls the viewInventory method in IV***");
        
        InventoryView inventoryView = new InventoryView();
        inventoryView.displayInventoryView();
    }
    
    private void purchaseSupplies() {
        this.console.println("***Calls the purchaseSupplies method in PSV***");
        
        PurchaseSuppliesView purchaseView = new PurchaseSuppliesView();
        purchaseView.displayPurchaseSuppliesView();
    }
    
    private void exploreLoc() {
        this.console.println("***Calls the exploreLoc method in ELV***");
        
        ExploreLocationView exploreLoc = new ExploreLocationView();
        exploreLoc.display();
    }
    
    private void move() {
        this.console.println("***Calls the move method in MoveView***");
        
        MoveView moveView = new MoveView();
        moveView.display();
    }
    
    private void estimateRes() {
        this.console.println("***Calls the estimateRes method in ERV***");
        
        EstimateResourcesView estResView = new EstimateResourcesView();
        estResView.display();
    }
    
    private void repairWagon() {
        this.console.println("***Calls the repairWagon method in RWV***");
        
        RepairWagonView repWagView = new RepairWagonView();
        repWagView.displayRepairWagonView();
    }
    
    private void useTools() {
        this.console.println("***Calls the useTools method in UTV***");
        
        UseToolsView useToolsView = new UseToolsView();
        useToolsView.displayUseToolsView();
    }
    
    private void fixSickness() {
        this.console.println("***Calls the fixSickness method in FSV***");
    }
    
    private void navigate() {
        this.console.println("***Calls the navigate method in NV***");
        
        NavigateView nav = new NavigateView();
        nav.displayNavigateView();
    }
    
    private void huntRes() {
        this.console.println("***Calls the huntRes method in HRV***");
        
        HuntResourcesView huntResView = new HuntResourcesView();
        huntResView.display();
    }
    
    private void saveGame() {
        this.console.println("***Calls the saveGame method in SGV***");
        
        SaveGameView saveView = new SaveGameView();
        saveView.displaySaveGameView();
    }
    
    private void getHelp() {
        HelpMenuView instance = new HelpMenuView();
        instance.display();
    }
}


