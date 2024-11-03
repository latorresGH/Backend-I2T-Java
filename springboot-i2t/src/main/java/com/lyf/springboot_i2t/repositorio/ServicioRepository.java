package com.lyf.springboot_i2t.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lyf.springboot_i2t.entidades.Servicio;
// import java.util.List;

@Repository
public interface ServicioRepository extends JpaRepository<Servicio, Long> {
    // List<Servicio> findByTipo(String tipo);
}
