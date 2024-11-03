package com.lyf.springboot_i2t.services;

import com.lyf.springboot_i2t.entidades.Ciudad;

import java.util.List;

public interface CiudadService {
    List<Ciudad> findAll();
    Ciudad findById(Long id);
    Ciudad save(Ciudad ciudad);
    void delete(Long id);
}
