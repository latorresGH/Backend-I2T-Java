package com.lyf.springboot_i2t.repositorio;

import com.lyf.springboot_i2t.entidades.Hospedaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HospedajeRepository extends JpaRepository<Hospedaje, Long> {
    List<Hospedaje> findByCiudadId(Long ciudadId);
}
