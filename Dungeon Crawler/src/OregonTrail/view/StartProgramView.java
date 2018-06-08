/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.view;
import java.util.Scanner;
/**
 *
 * @author MasterCraft Computer
 */
public class StartProgramView {
    public StartProgramView(){   
    }
    String[] inputs = this.getInputs();

    private String[] getInputs() {
        this.DisplayMainMenu();
        this.UserInput();
        this.DummyLoop();
        
        String[] inputs = new String[4];
        inputs[0] = "This is your Invetory";
        inputs[1] = "This is the Start of the Game";
        inputs[2] = "This is the your local store!";
        inputs[3] = "Please enter a valid input";
        
        return inputs;
    }

    public void setInputs(String[] inputs) {
        this.inputs = inputs;
    }
    
    private boolean doAction(String[] inputs){
        System.out.println("***Do action called***");
        System.out.println("\tinputs = " + inputs[0]);
        
        return true;
    }

    public void display() {
        System.out.println("Runs Dispaly Method");
    }

    private void DisplayMainMenu() {
        System.out.println("\n"
                + "\n -----------------------"
                + "\n | Game Menu            |"
                + "\n -----------------------"
                + "\nType the letter corrisponding"
                + "\nto the option/action you want"
                + "\nto take."
                + "\n"
                + "\nI - Look at inventory"
                + "\nG - Get Started"
                + "\nP - Purchase Supplies"
                + "\nQ - Quit"
                + "\n---------------------------");
    }
    
    public String UserInput(){
            Scanner keyboard = new Scanner(System.in);
            String userInput = keyboard.nextLine().trim().toUpperCase();
            return userInput;
    }

    private boolean DummyLoop() {
        boolean value = false;
        String loopInput = this.UserInput();
        System.out.println(loopInput);
        while(value == false){
            if("I".equals(loopInput)){
                InventoryView instance = new InventoryView();
                String getdisplayInventory = instance.getDisplayInvetory();
                System.out.println(inputs[0]);
                return true;
        }
            if("G".equals(loopInput)){
                StartView instance = new StartView();
                String getstartView = instance.getStartView();
                System.out.println(inputs[1]);
                return true;
        }
            if("P".equals(loopInput)){
                PurchaseSuppliesView instance = new PurchaseSuppliesView();
                String getpurchaseSuppliesView = instance.getPurchaseSuppliesView();
                System.out.println(inputs[2]);
                return true;
        }
            if("Q".equals(loopInput)){
                return false;
        }
            else return false;
        }
        return true;
    }
    
}

