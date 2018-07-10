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
public class PurchaseSuppliesException extends Exception {

    public PurchaseSuppliesException() {
    }

    public PurchaseSuppliesException(String string) {
        super(string);
    }

    public PurchaseSuppliesException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public PurchaseSuppliesException(Throwable thrwbl) {
        super(thrwbl);
    }

    public PurchaseSuppliesException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
