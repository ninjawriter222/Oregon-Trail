package exceptions;


public class OregonTrailException extends Exception {

    public OregonTrailException() {
    }

    public OregonTrailException(String string) {
        super(string);
    }

    public OregonTrailException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public OregonTrailException(Throwable thrwbl) {
        super(thrwbl);
    }

    public OregonTrailException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
