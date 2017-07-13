package data.dao.memory.interfaces;

import data.entities.Student;

import java.util.List;

/**
 * Basic repository interface for DAO objects
 */
public interface InMemoryStudentRepository {
    List<Student> selectAll();
    void add(Student student);
    void update(long id, Student student);
    void delete(Student student);
    void deleteAll();
}
