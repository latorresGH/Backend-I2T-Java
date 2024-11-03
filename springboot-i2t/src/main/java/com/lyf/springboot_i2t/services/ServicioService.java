package com.lyf.springboot_i2t.services;

import com.lyf.springboot_i2t.entidades.Servicio;

import java.util.List;

public interface ServicioService {
    List<Servicio> findAll();
    Servicio findById(Long id);
    Servicio save(Servicio servicio);
    void delete(Long id);
}
