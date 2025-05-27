package module;

import exceptions.RangeNoteException;

public class Note {
    private double score;
    private String subjectName;

    public Note(String subjectName, double score) throws RangeNoteException {
        this.score = score;
        this.subjectName = subjectName;
        if (score < 0 || score > 10) {
            throw new RangeNoteException();
        }
    }
    public double getCalification() {
        return score;
    }
    public String getSubjectName() {
        return subjectName;
    }
}

