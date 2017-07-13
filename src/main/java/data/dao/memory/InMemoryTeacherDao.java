package data.dao.memory;

import data.dao.memory.interfaces.InMemoryTeacherRepository;
import data.entities.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Teacher repository interface
 */
public class InMemoryTeacherDao implements InMemoryTeacherRepository {
    private Map<Long, Teacher> teacherMap;

    @Override
    public List<Teacher> selectAll() {
        return new ArrayList<>(teacherMap.values());
    }

    @Override
    public void add(Teacher teacher) {
        teacherMap.put(teacher.getId(), teacher);
    }

    @Override
    public void update(long id, Teacher teacher) {
        teacherMap.replace(id, teacher);
    }

    @Override
    public void delete(Teacher teacher) {
        teacherMap.remove(teacher.getId());
    }

    @Override
    public void deleteAll() {

    }
}
