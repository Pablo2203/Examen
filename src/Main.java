import exceptions.AvailableNotesException;
import exceptions.RangeNoteException;
import module.Note;
import module.Student;


public class Main {
    public static void main(String[] args) {
        Student student = new Student("Romina");
        Student student2 = new Student("Pablo");


        try {
            Note note1 = new Note("Java Backend", 4);
            Note note2 = new Note("Java Frontend", 6);
            Note note3 = new Note("Mongo DB", 2);

            student.addNote(note1);
            student.addNote(note2);
            student.addNote(note3);

            System.out.println("---------------------------------");

            student.removeNote(note3);

            System.out.println("---------------------------------");


            Note note4 = new Note("Java Backend", 10);
            Note note5 = new Note("Java Frontend", 4);
            Note note6 = new Note("Mongo DB", 0);


            student2.addNote(note4);
            student2.addNote(note5);
            student2.addNote(note6);

            System.out.println("---------------------------------");

            student.getNotes();

            System.out.println("---------------------------------");

            student2.getNotes();

            System.out.println("---------------------------------");

            student.calculateAverage();

            System.out.println("---------------------------------");

            student2.calculateAverage();
            
        }catch(RangeNoteException e) {
            System.out.println(e.getMessage());
        }catch(AvailableNotesException e) {
            System.out.println(e.getMessage());
        }
    }
}

/*
Registro de Notas de Estudiantes
Historia de usuario:

Como profesor quiero registrar los nombres de los alumnos y sus notas,
para poder tener un control básico del rendimiento.

Criterios de aceptación:

El usuario puede ingresar nombre y nota del estudiante.

La aplicación muestra una tabla con todos los registros ingresados.

Debe haber validación: la nota debe ser numérica entre 0 y 10.

Se debe poder eliminar un registro.

Bonus opcional: cálculo del promedio general.*/
