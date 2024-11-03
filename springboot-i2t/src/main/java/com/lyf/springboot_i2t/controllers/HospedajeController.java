package com.lyf.springboot_i2t.controllers;

import com.lyf.springboot_i2t.entidades.Hospedaje;
import com.lyf.springboot_i2t.services.HospedajeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hospedajes")
public class HospedajeController {

    private final HospedajeService hospedajeService;

    public HospedajeController(HospedajeService hospedajeService) {
        this.hospedajeService = hospedajeService;
    }

    @GetMapping
    public List<Hospedaje> getAllHospedajes() {
        return hospedajeService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Hospedaje> getHospedajeById(@PathVariable Long id) {
        Hospedaje hospedaje = hospedajeService.findById(id);
        return hospedaje != null ? ResponseEntity.ok(hospedaje) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public Hospedaje createHospedaje(@RequestBody Hospedaje hospedaje) {
        return hospedajeService.save(hospedaje);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Hospedaje> updateHospedaje(@PathVariable Long id, @RequestBody Hospedaje hospedaje) {
        hospedaje.setId(id); // Asegúrate de que el ID se setea en el objeto
        Hospedaje updatedHospedaje = hospedajeService.update(hospedaje);
        return ResponseEntity.ok(updatedHospedaje);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHospedaje(@PathVariable Long id) {
        hospedajeService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/ciudad/{ciudadId}")
    public List<Hospedaje> getHospedajesByCiudad(@PathVariable Long ciudadId) {
        return hospedajeService.findByCiudadId(ciudadId); // Método específico
    }
}
