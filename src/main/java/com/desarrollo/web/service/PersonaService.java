/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.web.service;

import com.desarrollo.web.interfaceService.IPersonaService;
import com.desarrollo.web.interfaces.IPersona;
import com.desarrollo.web.modelo.Persona;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service
public class PersonaService implements IPersonaService {

    @Autowired
    private IPersona data;

    @Override
    public List<Persona> listar() {
        return (List<Persona>)data.findAll();
    }

    @Override
    public int save(Persona p) {
    int res = 0;
        Persona persona = data.save(p);
        if(!persona.equals(null)){
            res=1;
        }
        return res;   
    }
    @Override
    public void delete(int id) {
        data.deleteById(id);
    }

    @Override
    public Optional<Persona> listarId(int id) {
        return data.findById(id);
    }
}
