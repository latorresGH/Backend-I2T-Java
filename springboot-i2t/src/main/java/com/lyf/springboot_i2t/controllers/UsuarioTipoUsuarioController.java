package com.lyf.springboot_i2t.controllers;

import com.lyf.springboot_i2t.entidades.UsuarioTipoUsuario;
import com.lyf.springboot_i2t.entidades.UsuarioTipoUsuarioId;
import com.lyf.springboot_i2t.services.UsuarioTipoUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/usuario-tipo-usuario")
public class UsuarioTipoUsuarioController {

    @Autowired
    private UsuarioTipoUsuarioService service;

    @GetMapping
    public List<UsuarioTipoUsuario> findAll() {
        return service.findAll();
    }

    @GetMapping("/{idUsuario}/{idTipoUsuario}")
    public ResponseEntity<UsuarioTipoUsuario> findById(@PathVariable Long idUsuario, @PathVariable Long idTipoUsuario) {
        UsuarioTipoUsuarioId id = new UsuarioTipoUsuarioId();
        id.setIdUsuario(idUsuario);
        id.setIdTipoUsuario(idTipoUsuario);
        Optional<UsuarioTipoUsuario> usuarioTipoUsuario = service.findById(id);
        
        return usuarioTipoUsuario.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).body(null));
    }

    @PostMapping
    public ResponseEntity<UsuarioTipoUsuario> save(@RequestBody UsuarioTipoUsuario usuarioTipoUsuario) {
        UsuarioTipoUsuario savedUsuarioTipoUsuario = service.save(usuarioTipoUsuario);
        return new ResponseEntity<>(savedUsuarioTipoUsuario, HttpStatus.CREATED);
    }
    
    @DeleteMapping("/{idUsuario}/{idTipoUsuario}")
    public ResponseEntity<Void> deleteById(@PathVariable Long idUsuario, @PathVariable Long idTipoUsuario) {
        UsuarioTipoUsuarioId id = new UsuarioTipoUsuarioId();
        id.setIdUsuario(idUsuario);
        id.setIdTipoUsuario(idTipoUsuario);
        
        Optional<UsuarioTipoUsuario> usuarioTipoUsuario = service.findById(id);
        if (usuarioTipoUsuario.isPresent()) {
            service.deleteById(id);
            return ResponseEntity.noContent().build(); // 204 No Content
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build(); // 404 Not Found
        }
    }
    
}
