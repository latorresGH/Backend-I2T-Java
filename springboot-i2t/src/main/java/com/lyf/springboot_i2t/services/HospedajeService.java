package com.lyf.springboot_i2t.services;

import com.lyf.springboot_i2t.entidades.Hospedaje;

import java.util.List;

public interface HospedajeService {
    List<Hospedaje> findAll();
    Hospedaje findById(Long id);
    Hospedaje save(Hospedaje hospedaje);
    Hospedaje update(Hospedaje hospedaje);
    void deleteById(Long id);
    List<Hospedaje> findByCiudadId(Long ciudadId); // Método específico
}
