package com.lyf.springboot_i2t.services.impl;

import com.lyf.springboot_i2t.entidades.Hospedaje;
import com.lyf.springboot_i2t.repositorio.HospedajeRepository;
import com.lyf.springboot_i2t.services.HospedajeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospedajeServiceImpl implements HospedajeService {

    private final HospedajeRepository hospedajeRepository;

    public HospedajeServiceImpl(HospedajeRepository hospedajeRepository) {
        this.hospedajeRepository = hospedajeRepository;
    }

    @Override
    public List<Hospedaje> findAll() {
        return hospedajeRepository.findAll();
    }

    @Override
    public Hospedaje findById(Long id) {
        return hospedajeRepository.findById(id).orElse(null);
    }

    @Override
    public Hospedaje save(Hospedaje hospedaje) {
        return hospedajeRepository.save(hospedaje);
    }

    @Override
    public Hospedaje update(Hospedaje hospedaje) {
        return hospedajeRepository.save(hospedaje);
    }

    @Override
    public void deleteById(Long id) {
        hospedajeRepository.deleteById(id);
    }

    @Override
    public List<Hospedaje> findByCiudadId(Long ciudadId) {
        return hospedajeRepository.findByCiudadId(ciudadId);
    }
}
