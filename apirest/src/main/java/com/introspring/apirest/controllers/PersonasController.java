package com.introspring.apirest.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.introspring.apirest.entities.Persona;
import com.introspring.apirest.services.IPersonaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(value="/personas")
public class PersonasController {

    @Autowired
    IPersonaService personaService;

    @GetMapping(value="/listar")
    public ResponseEntity<Object> listar() {
        return null;
    }

    @GetMapping(value="/vper/{cedula}")
    public ResponseEntity<Object> buscarPorCedula(@PathVariable(value = "cedula") String cedula) {
        Persona persona = personaService.buscarPorCedula(cedula);
        return ResponseEntity.ok().body(persona);
    }

    @GetMapping(value="/agregarCuenta")
    public ResponseEntity<Object> agregarCuenta(@RequestBody Persona persona) {
        Persona personaDB = personaService.buscarPorId(persona.getId());
        personaDB.getCuentas().addAll(persona.getCuentas());
        personaService.guardar(personaDB);
        return ResponseEntity.ok().body(personaDB);
    }
    
}
