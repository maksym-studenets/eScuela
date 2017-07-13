package data.entities;

import java.util.List;

/**
 * Represents a group (class, form) of students for their grouping
 */
public class Group {
    private long id;
    private List<Student> students;
    private Teacher groupTeacher;
}
