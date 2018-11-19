package guru.springframework.sfgpetclinic.services;

import java.util.Set;

/**
 * Created by lorenzo on 01/11/18.
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T objec);

    void deleteById(ID id);
}
