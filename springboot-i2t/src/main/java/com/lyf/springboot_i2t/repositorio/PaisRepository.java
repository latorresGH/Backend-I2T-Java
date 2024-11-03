package com.lyf.springboot_i2t.repositorio;

import com.lyf.springboot_i2t.entidades.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Long> {
    List<Pais> findByNombre(String nombre); // Encuentra países por nombre
}
