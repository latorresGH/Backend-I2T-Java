package com.lyf.springboot_i2t.services.impl;

import com.lyf.springboot_i2t.entidades.ServicioHospedaje;
import com.lyf.springboot_i2t.entidades.ServicioHospedajeId;
import com.lyf.springboot_i2t.repositorio.ServicioHospedajeRepository;
import com.lyf.springboot_i2t.services.ServicioHospedajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioHospedajeServiceImpl implements ServicioHospedajeService {

    @Autowired
    private ServicioHospedajeRepository servicioHospedajeRepository;

    @Override
    public List<ServicioHospedaje> findAll() {
        return servicioHospedajeRepository.findAll();
    }

    @Override
    public ServicioHospedaje findById(ServicioHospedajeId id) {
        return servicioHospedajeRepository.findById(id).orElse(null);
    }

    @Override
    public ServicioHospedaje save(ServicioHospedaje servicioHospedaje) {
        return servicioHospedajeRepository.save(servicioHospedaje);
    }
//                                                              The method dete(ServicioHospedajeId) of type servicioHospedajeServiceImpl must override or implement a supertype method
    @Override
    public void delete(ServicioHospedajeId id) {
        servicioHospedajeRepository.deleteById(id);
    }

    @Override
    public List<ServicioHospedaje> findByHospedajeId(Long hospedajeId) {
        return servicioHospedajeRepository.findByHospedajeId(hospedajeId); // Método específico
    }
}
