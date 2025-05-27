package exceptions;

public class AvailableNotesException extends Exception {
    public AvailableNotesException() {
        super("No hay notas disponibles para agregar");
    }
}
