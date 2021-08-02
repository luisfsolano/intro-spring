package com.introspring.apirest.repositories;

import java.util.List;

import com.introspring.apirest.entities.Cuenta;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuentaRepository extends JpaRepository<Cuenta,Long> {

    Cuenta findByNumeroCuenta(String numero);
    List<Cuenta> findByTipo(String tipo);
    
}
