package com.lyf.springboot_i2t.repositorio;


import com.lyf.springboot_i2t.entidades.Reserva;
import com.lyf.springboot_i2t.entidades.ReservaId;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, ReservaId> {
    List<Reserva> findByUsuario_Id(Long usuarioId); // Método para encontrar reservas por ID de usuario
    
    @Query("SELECT r FROM Reserva r WHERE DATE(r.fechaCheckIn) = :fechaCheckIn")
    List<Reserva> findByFechaCheckIn(@Param("fechaCheckIn") Date fechaCheckIn);

    
}
