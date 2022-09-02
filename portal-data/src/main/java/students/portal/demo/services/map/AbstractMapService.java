package students.portal.demo.services.map;

import students.portal.demo.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {
    protected Map<Long,T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findByID(ID id){
        return map.get(id);
    }

    T save(T object){
        if(object != null && object.getId() != null) {
            object.setId(getNextId());
            map.put(object.getId(),object);
        }
        else
            throw new RuntimeException("Object cannot be null");

        return object;
    }

    void deleteById(ID id){
        map.remove(id);
    }

    void delete(T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    private Long getNextId(){
        Long nextId = null;

        try {
            nextId = Collections.max(map.keySet()) + 1;
        }
        catch (NoSuchElementException e) {
           nextId = 1L;
        }
        return nextId;
    }
}
