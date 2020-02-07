package com.vss.springpetclinic.services.map;

import com.vss.springpetclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    public HashMap<Long, T> map = new HashMap<>();

    T findById(ID id) {
        return map.get(id);
    }

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T save(T object) {
        if(object != null)
        {
            Long nextId = null;
            try {
                nextId = getNextId();
            } catch(NoSuchElementException ne) {
                nextId = 1L;
            }
            object.setId(nextId);
            map.put(object.getId(), object);
        }

        return object;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T object) {
        map.entrySet().removeIf(entry -> entry.equals(object));
    }

    private Long getNextId() {
        return (Long)Collections.max(map.keySet()) + 1;
    }
}