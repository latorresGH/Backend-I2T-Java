package com.lyf.springboot_i2t.controllers;

import com.lyf.springboot_i2t.entidades.Ciudad;
import com.lyf.springboot_i2t.services.CiudadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ciudad")
public class CiudadController {

    @Autowired
    private CiudadService ciudadService;

    @GetMapping
    public List<Ciudad> getAll() {
        return ciudadService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ciudad> getById(@PathVariable Long id) {
        Ciudad ciudad = ciudadService.findById(id);
        return ciudad != null ? ResponseEntity.ok(ciudad) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public Ciudad create(@RequestBody Ciudad ciudad) {
        return ciudadService.save(ciudad);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        ciudadService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
