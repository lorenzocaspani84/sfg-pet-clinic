package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

/**
 * Created by lorenzo on 30/10/18.
 */
public interface PetService {

    Pet findById();

    Pet save(Pet pet);

    Set<Pet> findAll();
}
