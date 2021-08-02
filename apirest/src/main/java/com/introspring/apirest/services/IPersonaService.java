package com.introspring.apirest.services;

import java.util.List;

import com.introspring.apirest.entities.Persona;

public interface IPersonaService {
    List<Persona> buscarTodas();
    Persona buscarPorCedula(String cedula);
    Persona buscarPorId(Long id);
    Persona guardar(Persona persona);
}
