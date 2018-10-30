package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

/**
 * Created by lorenzo on 30/10/18.
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById();

    Owner save(Owner owner);

    Set<Owner> findAll();
}
