package com.vss.springpetclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public abstract class AbstractMapService<T, ID> {

    public HashMap<ID, T> map = new HashMap<>();

    T findById(ID id) {
        return map.get(id);
    }

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T save(ID id, T object) {
        map.put(id, object);
        return object;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T object) {
        map.entrySet().removeIf(entry -> entry.equals(object));
    }
}
