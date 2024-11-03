package com.lyf.springboot_i2t.services;

import com.lyf.springboot_i2t.entidades.Pais;

import java.util.List;

public interface PaisService {
    List<Pais> findAll();
    Pais findById(Long id);
    Pais save(Pais pais);
    void delete(Long id);
}
