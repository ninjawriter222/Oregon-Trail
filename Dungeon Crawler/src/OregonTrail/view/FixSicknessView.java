/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.view;

import java.util.Scanner;

/**
 *
 * @author hansm
 */
public class FixSicknessView extends View {

    public FixSicknessView() {
        super("Your team has the following ailments:"
                + "\nAILMENT1"
                + "\nAILMENT2"
                + "\nAILMENT3"
                + "\nAILMENT4"
                + "\n"
                + "\nWhich resource would you like to use to heal?"
                + "\n"
                + "\nType the letter corresponding to the option/action"
                + "\nyou want to take."
                + "\n"
                + "\nD - Press D to use Drinking Water"
                + "\nF - Press F to use Food"
                + "\nR - Press R to use Blankets"
                + "\nQ - Press Q to quit");
    }
    
    @Override
    public boolean doAction(String inputs) {
        String menuItem = inputs;
        switch (menuItem.toUpperCase()) {
            case "D":
                useWater();
                this.console.println("You have " + "WATER" + ". How much water do you want to use?");
                return false;
            case "F":
                useFood();
                this.console.println("You have " + "FOOD" + ". How much food do you want to use?");
                return false;
            case "R":
                useBlanket();
                this.console.println("You have " + "BLANKETS" + ". How many blankets do you want to use?");
                return false;
            default:
                this.console.println("ERROR: Invalid selection. Please try again");
        }
        return false;
    }

    private void useWater() {
        this.console.println("***Calls the water qty in the Model Layer***");
    }

    private void useFood() {
        this.console.println("***Calls the food qty in the Model Layer***");
    }

    private void useBlanket() {
        this.console.println("***Calls the blanket qty in the Model Layer***");
    }
}
