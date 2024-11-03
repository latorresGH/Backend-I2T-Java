package com.lyf.springboot_i2t.services.impl;

import com.lyf.springboot_i2t.entidades.TipoHospedaje;
import com.lyf.springboot_i2t.repositorio.TipoHospedajeRepository;
import com.lyf.springboot_i2t.services.TipoHospedajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoHospedajeServiceImpl implements TipoHospedajeService {

    @Autowired
    private TipoHospedajeRepository tipoHospedajeRepository;

    @Override
    public List<TipoHospedaje> findAll() {
        return tipoHospedajeRepository.findAll();
    }

    @Override
    public TipoHospedaje findById(Long id) {
        return tipoHospedajeRepository.findById(id).orElse(null);
    }

    @Override
    public TipoHospedaje save(TipoHospedaje tipoHospedaje) {
        return tipoHospedajeRepository.save(tipoHospedaje);
    }

    @Override
    public void delete(Long id) {
        tipoHospedajeRepository.deleteById(id);
    }
}
