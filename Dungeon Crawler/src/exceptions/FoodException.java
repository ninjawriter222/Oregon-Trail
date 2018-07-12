/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author hansm
 */
public class FoodException extends Exception {

    public FoodException() {
    }

    public FoodException(String string) {
        super(string);
    }

    public FoodException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public FoodException(Throwable thrwbl) {
        super(thrwbl);
    }

    public FoodException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
