/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OregonTrail.view;

import OregonTrail.OregonTrail;
import java.io.PrintWriter;

/**
 *
 * @author hansm
 */
public class ErrorView {
    private static PrintWriter console = OregonTrail.getOutFile();
    private static PrintWriter error = OregonTrail.getLogFile();
    
    public static void display(String className, String errorMsg) {
        console.println("\n--------------------ERROR--------------------"
        + "\n" + errorMsg
        + "\n---------------------------------------------");
        
        error.printf("%n%n%s", className + "-" + errorMsg);
    }
}
