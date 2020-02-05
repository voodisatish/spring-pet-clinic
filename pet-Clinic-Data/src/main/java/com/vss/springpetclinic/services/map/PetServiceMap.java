package com.vss.springpetclinic.services.map;

import com.vss.springpetclinic.model.Pet;
import com.vss.springpetclinic.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {


    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Pet object) {
         super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deleteBy(Long id) {
         super.deleteById(id);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
