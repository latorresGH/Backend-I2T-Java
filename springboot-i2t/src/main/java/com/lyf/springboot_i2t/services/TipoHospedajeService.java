package com.lyf.springboot_i2t.services;

import com.lyf.springboot_i2t.entidades.TipoHospedaje;

import java.util.List;

public interface TipoHospedajeService {
    List<TipoHospedaje> findAll();
    TipoHospedaje findById(Long id);
    TipoHospedaje save(TipoHospedaje tipoHospedaje);
    void delete(Long id);
}
