package com.lyf.springboot_i2t.controllers;

import com.lyf.springboot_i2t.entidades.TipoUsuario;
import com.lyf.springboot_i2t.services.TipoUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tipoUsuario")
public class TipoUsuarioController {

    @Autowired
    private TipoUsuarioService tipoUsuarioService;

    @GetMapping
    public List<TipoUsuario> getAll() {
        return tipoUsuarioService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TipoUsuario> getById(@PathVariable Long id) {
        TipoUsuario tipoUsuario = tipoUsuarioService.findById(id);
        return tipoUsuario != null ? ResponseEntity.ok(tipoUsuario) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public TipoUsuario create(@RequestBody TipoUsuario tipoUsuario) {
        return tipoUsuarioService.save(tipoUsuario);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        tipoUsuarioService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
