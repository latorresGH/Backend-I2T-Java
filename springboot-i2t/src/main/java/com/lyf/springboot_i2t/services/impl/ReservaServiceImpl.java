package com.lyf.springboot_i2t.services.impl;

import com.lyf.springboot_i2t.entidades.Reserva;
import com.lyf.springboot_i2t.entidades.ReservaId; // Importa la clase ReservaId
import com.lyf.springboot_i2t.repositorio.ReservaRepository;
import com.lyf.springboot_i2t.services.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ReservaServiceImpl implements ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    @Override
    public List<Reserva> findAll() {
        return reservaRepository.findAll();
    }

    // Cambia el tipo de parámetro a ReservaId
    @Override
    public Reserva findById(ReservaId id) {
        return reservaRepository.findById(id).orElse(null);
    }

    @Override
    public Reserva save(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    // Cambia el tipo de parámetro a ReservaId
    @Override
    public void delete(ReservaId id) {
        reservaRepository.deleteById(id);
    }

    // Método para buscar reservas por ID de usuario. Asegúrate de que este método esté definido en tu repositorio.
    @Override
    public List<Reserva> findByUsuarioId(Long usuarioId) {
        return reservaRepository.findByUsuario_Id(usuarioId); // Método específico
    }

    // Método para buscar reservas por fecha de reserva. Asegúrate de que este método esté definido en tu repositorio.
    @Override
    public List<Reserva> findByFechaCheckIn(Date fechaCheckIn) {
        return reservaRepository.findByFechaCheckIn(fechaCheckIn); // Método específico
    }
}
