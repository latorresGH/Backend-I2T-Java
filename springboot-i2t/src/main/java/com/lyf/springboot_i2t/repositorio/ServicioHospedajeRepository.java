package com.lyf.springboot_i2t.repositorio;

import com.lyf.springboot_i2t.entidades.ServicioHospedaje;
import com.lyf.springboot_i2t.entidades.ServicioHospedajeId;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServicioHospedajeRepository extends JpaRepository<ServicioHospedaje, ServicioHospedajeId> {
    List<ServicioHospedaje> findByHospedajeId(Long hospedajeId);
    List<ServicioHospedaje> findByServicioId(Long servicioId); // Encuentra servicios por ID de servicio
}
