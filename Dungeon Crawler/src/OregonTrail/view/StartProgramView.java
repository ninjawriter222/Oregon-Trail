/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.view;

import OregonTrail.control.GameControl;
import java.util.Scanner;
import OregonTrail.model.Player;

/**
 *
 * @author MasterCraft Computer
 */
public abstract class StartProgramView extends View {

    public StartProgramView() {
        super("Hello and welcome to our Oregon Trail game."
                + "\nYour goal in this game will be to safely make it to Oregon."
                + "\nWe hope you die a lot!");
    }

    //String[] inputs = this.getInputs();
    public void display() {
    }

    public String[] getInputs(String[] inputs) {
        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {
        String playersName = inputs[0];
        //The line after this is important and 
        //took me a long time to figure out.
        Player player = GameControl.savePlayer(playersName);
        if (player == null) {
            System.out.println("Could not create the player. Please enter a "
                    + "different name.");
            return false;
        }
        System.out.println("================================================="
                + "\n    Hello " + inputs[0] + " and welcome to the Oregon "
                + "Trail!"
                + "\n=================================================");
        MainMenuView mainMenuView = new MainMenuView() {};
        mainMenuView.display();
        return true;
    }

//    private void DisplayMainMenu() {
//        System.out.println("\n"
//                + "\n -----------------------"
//                + "\n | Game Menu            |"
//                + "\n -----------------------"
//                + "\nType the letter corrisponding"
//                + "\nto the option/action you want"
//                + "\nto take."
//                + "\n"
//                + "\nI - Look at inventory"
//                + "\nG - Get Started"
//                + "\nP - Purchase Supplies"
//                + "\nQ - Quit"
//                + "\n---------------------------");
//    }
//    public String UserInput(){
//            Scanner keyboard = new Scanner(System.in);
//            String userInput = keyboard.nextLine().trim().toUpperCase();
//            return userInput;
//    }
//    private boolean DummyLoop() {
//        boolean value = false;
//        String loopInput = this.UserInput();
//        System.out.println(loopInput);
//        while(value == false){
//            if("I".equals(loopInput)){
//                InventoryView instance = new InventoryView();
//                String getdisplayInventory = instance.getDisplayInvetory();
//                System.out.println(inputs[0]);
//                return true;
//        }
//            if("G".equals(loopInput)){
//                StartView instance = new StartView();
//                String getstartView = instance.getStartView();
//                System.out.println(inputs[1]);
//                return true;
//        }
//            if("P".equals(loopInput)){
//                PurchaseSuppliesView instance = new PurchaseSuppliesView();
//                String getpurchaseSuppliesView = instance.getPurchaseSuppliesView();
//                System.out.println(inputs[2]);
//                return true;
//        }
//            if("Q".equals(loopInput)){
//                return false;
//        }
//            else return false;
//        }
//        return true;
//    }
}
