package com.lyf.springboot_i2t.repositorio;

import com.lyf.springboot_i2t.entidades.TipoHospedaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TipoHospedajeRepository extends JpaRepository<TipoHospedaje, Long> {
    List<TipoHospedaje> findByNombre(String nombre); // Encuentra tipos de hospedaje por nombre
}
