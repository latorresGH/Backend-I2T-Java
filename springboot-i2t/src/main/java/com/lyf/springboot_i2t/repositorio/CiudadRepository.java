package com.lyf.springboot_i2t.repositorio;

import com.lyf.springboot_i2t.entidades.Ciudad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CiudadRepository extends JpaRepository<Ciudad, Long> {
    List<Ciudad> findByNombre(String nombre); // Encuentra ciudades por nombre
    List<Ciudad> findByPaisId(Long paisId); // Encuentra ciudades por ID de país
}
