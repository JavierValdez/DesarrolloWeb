/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desarrollo.web.controler;

import com.desarrollo.web.interfaceService.IPersonaService;
import com.desarrollo.web.modelo.Persona;
import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Usuario
 */
@Controller
@RequestMapping
public class Controlador {
    
    @Autowired
    private IPersonaService service;
    
    @GetMapping("/listar")
    public String listar(Model model){
        List<Persona>personas=service.listar();
        model.addAttribute("personas",personas);
        return "index";
    }
    @GetMapping("/nuevo")
    public String agregar(Model model){
        model.addAttribute("persona", new Persona());
        return "form";
    }
    @PostMapping("/guardar")
    public String guardar(@Valid Persona p, Model model){
        service.save(p);
        return "redirect:/listar";
    }
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model){
        Optional<Persona> persona = service.listarId(id);
        model.addAttribute("persona", persona);
        return "form";
    }
    @GetMapping("/eliminar/{id}")
    public String delete(Model model,@PathVariable int id){
        service.delete(id);
        return "redirect:/listar";
    }
    
}
