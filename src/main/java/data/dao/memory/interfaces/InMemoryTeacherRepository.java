package data.dao.memory.interfaces;

import data.entities.Teacher;

import java.util.List;

/**
 * Teachers' data repository (emulated for memory)
 */
public interface InMemoryTeacherRepository {
    List<Teacher> selectAll();
    void add(Teacher teacher);
    void update(long id, Teacher teacher);
    void delete(Teacher teacher);
    void deleteAll();
}
