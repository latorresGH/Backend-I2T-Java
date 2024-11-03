package com.lyf.springboot_i2t.services.impl;

import com.lyf.springboot_i2t.entidades.Ciudad;
import com.lyf.springboot_i2t.repositorio.CiudadRepository;
import com.lyf.springboot_i2t.services.CiudadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CiudadServiceImpl implements CiudadService {

    @Autowired
    private CiudadRepository ciudadRepository;

    @Override
    public List<Ciudad> findAll() {
        return ciudadRepository.findAll();
    }

    @Override
    public Ciudad findById(Long id) {
        return ciudadRepository.findById(id).orElse(null);
    }

    @Override
    public Ciudad save(Ciudad ciudad) {
        return ciudadRepository.save(ciudad);
    }

    @Override
    public void delete(Long id) {
        ciudadRepository.deleteById(id);
    }
}
