package data.dao.memory.interfaces;

import data.entities.Parents;

import java.util.List;

/**
 * Created by Maksym on 12.07.2017.
 */
public interface InMemoryParentsRepository {
    List<Parents> selectAll();
    void add(Parents parent);
    void update(long id, Parents parent);
    void delete(Parents parent);
    void deleteAll();
}
