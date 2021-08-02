package com.introspring.apirest.repositories;

import com.introspring.apirest.entities.Persona;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona,Long>{
    Persona findByCedula(String cedula);
}
