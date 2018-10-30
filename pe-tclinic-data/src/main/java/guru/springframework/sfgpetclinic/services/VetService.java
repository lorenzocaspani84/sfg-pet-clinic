package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

/**
 * Created by lorenzo on 30/10/18.
 */
public interface VetService {

    Vet findById();

    Vet save(Vet vet);

    Set<Vet> findAll();
}
