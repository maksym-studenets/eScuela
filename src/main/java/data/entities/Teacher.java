package data.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;

/**
 * Base data model class for a 'Teacher' entity
 */
public class Teacher extends Person {

    /**
     * Unique integer identificator of a teacher. Generated automatically and is used
     * as a principal reference to a teacher.
     * */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    /**
     * A list of subjects this particular teacher teachers, and therefore can conduct lessons
     * and assign points to students.
     * */
    private ArrayList<Subject> subjects;

    public Teacher(String surname, String name, String patronymic) {
        super(surname, name, patronymic);
    }

    public long getId() {
        return id;
    }
}
