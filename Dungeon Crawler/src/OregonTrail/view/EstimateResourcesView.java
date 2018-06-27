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
public class EstimateResourcesView extends View {

    public EstimateResourcesView() {
        super("Which inventory item would you like to review?"
                + "\nType the letter corresponding to the option/action"
                + "\nyou want to take."
                + "\n"
                + "\nF - Press F to get rid of Food"
                + "\nA - Press A to get rid of your Axe"
                + "\nH - Press H to get rid of your Hammer"
                + "\nS - Press S to get rid of Spare Whell(s)"
                + "\nB - Press B to get rid of Bullets"
                + "\nW - Press W to get rid of Wood"
                + "\nR - Press R to get rid of Blanket(s)"
                + "\nD - Press D to get rid of Drinking Water"
                + "\nQ - Press Q to Quit");
    }
    
    @Override
    public boolean doAction(String inputs) {
        String menuItem = inputs;
        switch (menuItem.toUpperCase()) {
            case "F":
                getFoodAmt();
                System.out.println("You have " + "FOOD AMOUNT" + ". How much would you like to leave behind?");
                return false;
            case "A":
                getAxeAmt();
                System.out.println("You have " + "AXE QUANTITY" + ". How much would you like to leave behind?");
                return false;
            case "H":
                getHammerAmt();
                System.out.println("You have " + "HAMMER QUANTITY" + ". How much would you like to leave behind?");
                return false;
            case "S":
                getSpareAmt();
                System.out.println("You have " + "SPARE WHEEL(S) QTY" + ". How much would you like to leave behind?");
                return false;
            case "B":
                getBulletAmt();
                System.out.println("You have " + "BULLETS" + ". How much would you like to leave behind?");
                return false;
            case "W":
                getWoodAmt();
                System.out.println("You have " + "WOOD" + ". How much would you like to leave behind?");
                return false;
            case "R":
                getBlanketAmt();
                System.out.println("You have " + "BLANKETS" + ". How much would you like to leave behind?");
                return false;
            case "D":
                getWaterAmt();
                System.out.println("You have " + "DRINKING WATER" + ". How much would you like to leave behind?");
                return false;
            default:
                System.out.println("ERROR: Invalid selection. Please try again");
        }
        return false;
    }

    private void getFoodAmt() {
        System.out.println("***Calls the food qty in the Model Layer***");
    }

    private void getAxeAmt() {
        System.out.println("***Calls the axe qty in the Model Layer***");
    }

    private void getHammerAmt() {
        System.out.println("***Calls the hammer qty in the Model Layer***");
    }

    private void getWaterAmt() {
        System.out.println("***Calls the water qty in the Model Layer***");
    }

    private void getSpareAmt() {
        System.out.println("***Calls the spare wheel qty in the Model Layer***");
    }

    private void getBulletAmt() {
        System.out.println("***Calls the bullet qty in the Model Layer***");
    }

    private void getWoodAmt() {
        System.out.println("***Calls the wood qty in the Model Layer***");
    }

    private void getBlanketAmt() {
        System.out.println("***Calls the blanket qty in the Model Layer***");
    }
    
}
