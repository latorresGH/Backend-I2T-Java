package com.lyf.springboot_i2t.controllers;

import com.lyf.springboot_i2t.entidades.ServicioHospedaje;
import com.lyf.springboot_i2t.entidades.ServicioHospedajeId;
import com.lyf.springboot_i2t.services.ServicioHospedajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/servicioHospedaje")
public class ServicioHospedajeController {

    @Autowired
    private ServicioHospedajeService servicioHospedajeService;

    @GetMapping
    public List<ServicioHospedaje> getAll() {
        return servicioHospedajeService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ServicioHospedaje> getById(@PathVariable ServicioHospedajeId id) { // Cambiar a ServicioHospedajeId
        ServicioHospedaje servicioHospedaje = servicioHospedajeService.findById(id);
        return servicioHospedaje != null ? ResponseEntity.ok(servicioHospedaje) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ServicioHospedaje create(@RequestBody ServicioHospedaje servicioHospedaje) {
        return servicioHospedajeService.save(servicioHospedaje);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable ServicioHospedajeId id) { // Cambiar a ServicioHospedajeId
        servicioHospedajeService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/hospedaje/{hospedajeId}")
    public List<ServicioHospedaje> getByHospedajeId(@PathVariable Long hospedajeId) {
        return servicioHospedajeService.findByHospedajeId(hospedajeId); // Método específico
    }
}
