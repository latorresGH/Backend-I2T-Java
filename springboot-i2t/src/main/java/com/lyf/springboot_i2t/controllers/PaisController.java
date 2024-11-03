package com.lyf.springboot_i2t.controllers;

import com.lyf.springboot_i2t.entidades.Pais;
import com.lyf.springboot_i2t.services.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pais")
public class PaisController {

    @Autowired
    private PaisService paisService;

    @GetMapping
    public List<Pais> getAll() {
        return paisService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pais> getById(@PathVariable Long id) {
        Pais pais = paisService.findById(id);
        return pais != null ? ResponseEntity.ok(pais) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public Pais create(@RequestBody Pais pais) {
        return paisService.save(pais);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        paisService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
