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
public class RepairWagonException extends Exception {

    public RepairWagonException() {
    }

    public RepairWagonException(String string) {
        super(string);
    }

    public RepairWagonException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public RepairWagonException(Throwable thrwbl) {
        super(thrwbl);
    }

    public RepairWagonException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
