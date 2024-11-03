package com.lyf.springboot_i2t.services;

import com.lyf.springboot_i2t.entidades.ServicioHospedaje;
import com.lyf.springboot_i2t.entidades.ServicioHospedajeId;

import java.util.List;

public interface ServicioHospedajeService {
    List<ServicioHospedaje> findAll();
    ServicioHospedaje findById(ServicioHospedajeId id); // Cambiar aquí
    ServicioHospedaje save(ServicioHospedaje servicioHospedaje);
    void delete(ServicioHospedajeId id); // Cambiar aquí
    List<ServicioHospedaje> findByHospedajeId(Long hospedajeId);
}
