package com.lyf.springboot_i2t.controllers;

import com.lyf.springboot_i2t.entidades.Reserva;
import com.lyf.springboot_i2t.entidades.ReservaId; // Asegúrate de importar ReservaId
import com.lyf.springboot_i2t.services.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/reserva")
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    @GetMapping
    public List<Reserva> getAll() {
        return reservaService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Reserva> getById(@PathVariable ReservaId id) { // Cambiado a ReservaId
        Reserva reserva = reservaService.findById(id);
        return reserva != null ? ResponseEntity.ok(reserva) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public Reserva create(@RequestBody Reserva reserva) {
        return reservaService.save(reserva);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable ReservaId id) { // Cambiado a ReservaId
        reservaService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/usuario/{usuarioId}")
    public List<Reserva> getByUsuarioId(@PathVariable Long usuarioId) {
        return reservaService.findByUsuarioId(usuarioId); // Método específico
    }

    @GetMapping("/fecha/{fechaReserva}")
    public List<Reserva> getByFechaReserva(@PathVariable String fechaReserva) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Asegúrate de usar el formato correcto
        try {
            Date fecha = dateFormat.parse(fechaReserva);
            return reservaService.findByFechaCheckIn(fecha); // Método específico
        } catch (ParseException e) {
            // Manejo de error si la fecha no se puede parsear
            e.printStackTrace();
            return new ArrayList<>(); // O puedes lanzar una excepción personalizada
        }
}
}
