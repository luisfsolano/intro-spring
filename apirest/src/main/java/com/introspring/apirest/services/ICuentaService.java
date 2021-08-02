package com.introspring.apirest.services;

import java.util.List;

import com.introspring.apirest.entities.Cuenta;

public interface ICuentaService {
    List<Cuenta> buscarTodas();
    List<Cuenta> buscarPorTipo(String tipo);
    Cuenta buscarPorNumero(String numeroCuenta);
}
