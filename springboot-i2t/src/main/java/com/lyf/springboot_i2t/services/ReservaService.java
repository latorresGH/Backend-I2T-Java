package com.lyf.springboot_i2t.services;

import com.lyf.springboot_i2t.entidades.Reserva;
import com.lyf.springboot_i2t.entidades.ReservaId; // Asegúrate de importar ReservaId

import java.util.Date;
import java.util.List;

public interface ReservaService {
    List<Reserva> findAll();
    
    // Cambia el tipo de parámetro a ReservaId
    Reserva findById(ReservaId id);
    
    Reserva save(Reserva reserva);
    
    // Cambia el tipo de parámetro a ReservaId
    void delete(ReservaId id);
    
    List<Reserva> findByUsuarioId(Long usuarioId); // Método específico
    List<Reserva> findByFechaCheckIn(Date fechaCheckIn); // Método específico
}
