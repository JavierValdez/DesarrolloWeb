/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.web.interfaceService;

import com.desarrollo.web.modelo.Persona;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
public interface IPersonaService {
    public List<Persona> listar();
    
    public Optional<Persona> listarId(int id);

    public int save(Persona p);
    
    public void delete(int id);
}
