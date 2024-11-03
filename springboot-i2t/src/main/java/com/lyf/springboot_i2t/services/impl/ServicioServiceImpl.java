package com.lyf.springboot_i2t.services.impl;

import com.lyf.springboot_i2t.entidades.Servicio;
import com.lyf.springboot_i2t.repositorio.ServicioRepository;
import com.lyf.springboot_i2t.services.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioServiceImpl implements ServicioService {

    @Autowired
    private ServicioRepository servicioRepository;

    @Override
    public List<Servicio> findAll() {
        return servicioRepository.findAll();
    }

    @Override
    public Servicio findById(Long id) {
        return servicioRepository.findById(id).orElse(null);
    }

    @Override
    public Servicio save(Servicio servicio) {
        return servicioRepository.save(servicio);
    }

    @Override
    public void delete(Long id) {
        servicioRepository.deleteById(id);
    }

}
