package com.lyf.springboot_i2t.controllers;

import com.lyf.springboot_i2t.entidades.TipoHospedaje;
import com.lyf.springboot_i2t.services.TipoHospedajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tipoHospedaje")
public class TipoHospedajeController {

    @Autowired
    private TipoHospedajeService tipoHospedajeService;

    @GetMapping
    public List<TipoHospedaje> getAll() {
        return tipoHospedajeService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TipoHospedaje> getById(@PathVariable Long id) {
        TipoHospedaje tipoHospedaje = tipoHospedajeService.findById(id);
        return tipoHospedaje != null ? ResponseEntity.ok(tipoHospedaje) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public TipoHospedaje create(@RequestBody TipoHospedaje tipoHospedaje) {
        return tipoHospedajeService.save(tipoHospedaje);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        tipoHospedajeService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
