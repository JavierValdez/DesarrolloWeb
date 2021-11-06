
package com.desarrollo.web.interfaces;

import com.desarrollo.web.modelo.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Usuario
 */
@Repository
public interface IPersona extends CrudRepository<Persona, Integer> {
    
}
