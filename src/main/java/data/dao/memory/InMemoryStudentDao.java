package data.dao.memory;

import data.dao.memory.interfaces.InMemoryStudentRepository;
import data.entities.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Student repository interface
 */
public class InMemoryStudentDao implements InMemoryStudentRepository {

    private Map<Long, Student> studentMap = new HashMap<>();

    @Override
    public List<Student> selectAll() {
        return new ArrayList<>(studentMap.values());
    }

    @Override
    public void add(Student student) {
        studentMap.put(student.getId(), student);
    }

    @Override
    public void update(long id, Student student) {
        //studentMap.get(id).setSurname(student.getSurname());
        studentMap.replace(id, student);
    }

    @Override
    public void delete(Student student) {
        studentMap.remove(student.getId());
    }

    @Override
    public void deleteAll() {
        studentMap.clear();
    }
}
