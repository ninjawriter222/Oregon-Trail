/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.view;

import OregonTrail.model.Speed;
import java.util.Scanner;

/**
 *
 * @author MasterCraft Computer
 */
class MoveView {

    public MoveView() {

    }

    public void display() {
        boolean endOfView = false;
        String[] inputs = null;
        do {
            inputs = getInputs();
            if (inputs[0] == null || "Q".equals(inputs[0].toUpperCase())) {
                return;
            }
            endOfView = doAction(inputs);
        } while (!endOfView);
    }

    private String[] getInputs() {
        String[] inputs = new String[1];
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++"
                + "\n+             This is the Move Menu               +"
                + "\n+++++++++++++++++++++++++++++++++++++++++++++++++++"
                + "\nType the word corresponding"
                + "\nto the speed you want to"
                + "\ntravel at."
                + "\n"
                + "\nslow - sets your pace to slow."
                + "\nnormal - sets your pace to noraml."
                + "\nfast - sets your pace to fast."
                + "\nE - Press E to exit"
                + "\n---------------------------");
        boolean valid = false;
        do {
            System.out.println("Please enter in your selection");
            Scanner keyboard = new Scanner(System.in);
            inputs[0] = keyboard.nextLine().toString();
            if (inputs[0].length() < 1 || "E".toUpperCase().equals(inputs[0])) {
                System.out.println("ERROR: Your selction must be longer than 1"
                        + " character.");
                valid = false;
            } else {
                valid = true;
            }
        } while (!valid);
        return inputs;
    }

    private boolean doAction(String[] inputs) {
        String speed = inputs[0];
        Speed instance = new Speed();
        double getSpeed = instance.setSpeed(speed);
        if ("slow".equals(inputs[0]) || "noramal".equals(inputs[0]) || "fast".equals(inputs[0])) {
            System.out.println("You have set your speed to " + speed);
        }
    return true;
    }
}    

