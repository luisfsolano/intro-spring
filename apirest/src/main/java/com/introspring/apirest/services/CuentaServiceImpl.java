package com.introspring.apirest.services;

import java.util.List;

import com.introspring.apirest.entities.Cuenta;
import com.introspring.apirest.repositories.CuentaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "cuentaService")
public class CuentaServiceImpl implements ICuentaService{
    
    @Autowired
    CuentaRepository cuentaRepository;

    @Override
    public List<Cuenta> buscarTodas() {
        return cuentaRepository.findAll();
    }

    @Override
    public List<Cuenta> buscarPorTipo(String tipo) {
        return cuentaRepository.findByTipo(tipo);
    }

    @Override
    public Cuenta buscarPorNumero(String numeroCuenta) {
        return cuentaRepository.findByNumeroCuenta(numeroCuenta);
    }

}
