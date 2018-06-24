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
    public void display(){
    }
    
    public String[] getInputs(String[] inputs) {
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String menuItem = inputs[0];
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
                System.out.println("ERROR: Invalid selection. Please try again");
        }
        return false;
    }
    
    private void viewMap() {
        System.out.println("***Calls the viewMap method in MapV***");
        GameControl.createNewGame(OregonTrail.getPlayer());
        
        MapView mapView = new MapView();
        mapView.displayMapView();
    }
    
    private void viewInventory() {
        System.out.println("***Calls the viewInventory method in IV***");
        GameControl.createNewGame(OregonTrail.getPlayer());
        
        InventoryView inventoryView = new InventoryView();
        inventoryView.displayInventoryView();
    }
    
    private void purchaseSupplies() {
        System.out.println("***Calls the purchaseSupplies method in PSV***");
        GameControl.createNewGame(OregonTrail.getPlayer());
        
        PurchaseSuppliesView purchaseView = new PurchaseSuppliesView();
        purchaseView.displayPurchaseSuppliesView();
    }
    
    private void exploreLoc() {
        System.out.println("***Calls the exploreLoc method in ELV***");
        GameControl.createNewGame(OregonTrail.getPlayer());
        
        ExploreLocationView exploreLoc = new ExploreLocationView();
        exploreLoc.displayExploreLocationView();
    }
    
    private void move() {
        System.out.println("***Calls the move method in MoveView***");
        GameControl.createNewGame(OregonTrail.getPlayer());
        
        MoveView moveView = new MoveView();
        moveView.display();
    }
    
    private void estimateRes() {
        System.out.println("***Calls the estimateRes method in ERV***");
        GameControl.createNewGame(OregonTrail.getPlayer());
        
        EstimateResourcesView estResView = new EstimateResourcesView();
        estResView.displayEstimateResourcesView();
    }
    
    private void repairWagon() {
        System.out.println("***Calls the repairWagon method in RWV***");
        GameControl.createNewGame(OregonTrail.getPlayer());
        
        RepairWagonView repWagView = new RepairWagonView();
        repWagView.displayRepairWagonView();
    }
    
    private void useTools() {
        System.out.println("***Calls the useTools method in UTV***");
        GameControl.createNewGame(OregonTrail.getPlayer());
        
        UseToolsView useToolsView = new UseToolsView();
        useToolsView.displayUseToolsView();
    }
    
    private void fixSickness() {
        System.out.println("***Calls the fixSickness method in FSV***");
        GameControl.createNewGame(OregonTrail.getPlayer());
    }
    
    private void navigate() {
        System.out.println("***Calls the navigate method in NV***");
        GameControl.createNewGame(OregonTrail.getPlayer());
        
        NavigateView nav = new NavigateView();
        nav.displayNavigateView();
    }
    
    private void huntRes() {
        System.out.println("***Calls the huntRes method in HRV***");
        GameControl.createNewGame(OregonTrail.getPlayer());
        
        HuntResourcesView huntResView = new HuntResourcesView();
        huntResView.displayHuntResourcesView();
    }
    
    private void saveGame() {
        System.out.println("***Calls the saveGame method in SGV***");
        GameControl.createNewGame(OregonTrail.getPlayer());
        
        SaveGameView saveView = new SaveGameView();
        saveView.displaySaveGameView();
    }
    
    private void getHelp() {
        HelpMenuView instance = new HelpMenuView();
        instance.displayHelpMenuView();
    }
}


