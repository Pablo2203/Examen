package module;

import exceptions.AvailableNotesException;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String fullName;
    private Note note;
    private ArrayList<Note> notes;
    private ArrayList<Student> students;

    public Student(String fullName) {
        this.fullName = fullName;
        this.notes = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public void addNote(Note note) {
        System.out.println("Nota agregada: " + note.getSubjectName() + " = " + note.getCalification() + ". Para estudiante: " +  Student.this.fullName);

        this.notes.add(note);
    }
    public void removeNote(Note note) {
        System.out.println("Nota eliminada: " + note.getSubjectName() + " = " + note.getCalification() + ". Para estudiante: " +  Student.this.fullName);

        this.notes.remove(note);
    }
    public  List<Note> getNotes() throws AvailableNotesException {
        System.out.println("Notas del alumno: ");
        for (Note note : notes) {
            System.out.println(Student.this.fullName + ": " + note.getSubjectName() + " = " + note.getCalification());
        }
        return notes;
    }
   /* public  List<module.Student> getStudents() throws AvailableStudentsException {
        System.out.println("Clase: ");
        for (module.Student student : students) {
            System.out.println(module.Student.this.fullName + ": " + note.getSubjectName() + " = " + note.getCalification());
        }
        return students;
    }*/
    public double calculateAverage() {
        double average = 0;
        System.out.println("Notas del alumno: " + Student.this.fullName);
        for (Note note : notes) {
            average += note.getCalification();
        }
        average /= notes.size();
        System.out.println("Promedio de notas: " + average);
        return average;
    }
}
