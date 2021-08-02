package com.introspring.apirest.services;

import java.util.List;

import com.introspring.apirest.entities.Persona;
import com.introspring.apirest.repositories.PersonaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "personaService")
public class PersonaServiceImpl implements IPersonaService{

    @Autowired
    PersonaRepository personaRepository;

    @Override
    public List<Persona> buscarTodas() {
        return personaRepository.findAll();
    }

    @Override
    public Persona buscarPorCedula(String cedula) {
        return personaRepository.findByCedula(cedula);
    }
    
}
