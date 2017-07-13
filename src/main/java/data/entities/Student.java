package data.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Base data model class for 'Student' entity
 */
@Entity
public class Student extends Person {
    /**
     * Unique identificator of a student of an integer type, each value is generated automatically
     * to avoid conflicts and collision. Student's ID will be used as a reference in other fields
     * or entities of the school database (for example, to note absent students and for putting notes).
     * */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    /**
     * Represents reference to a group (or class, in case of a school) to which
     * this particular student belongs. Groups (classes) are used for natural grouping
     * of students and to facilitate search and selection of students
     * */
    private Group group;

    /**
     * Reference to a student's parent. This will be used to sent notifications to parents
     * */
    private Parents parent1;

    /**
     * Reference to a student's parent #2 (if applicable).
     * */
    private Parents parent2;

    /**
     * Used to construct an <i>'empty'</i> student object.
     * */
    protected Student() {
        super("", "", "");
    }

    /**
     * Basic constructor. Takes surname, name and a patronymic and constructs
     * a new instance of this class using implementation provided in {@link Person} superclass.
     * Student's ID is generated automatically, group and parents' references are set to null.
     * */
    public Student(String surname, String name, String patronymic) {
        super(surname, name, patronymic);
    }

    public long getId() {
        return id;
    }
}
