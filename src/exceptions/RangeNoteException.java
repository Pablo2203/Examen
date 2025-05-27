package exceptions;

public class RangeNoteException extends Exception {
    public RangeNoteException() {
        super("La nota debe estar entre 0 y 10");
    }
}
