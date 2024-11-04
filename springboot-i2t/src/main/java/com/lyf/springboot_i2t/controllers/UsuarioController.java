package com.lyf.springboot_i2t.controllers;

import com.lyf.springboot_i2t.entidades.Usuario;
import com.lyf.springboot_i2t.services.UsuarioService;
// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<Usuario> crearUsuario(@RequestBody CrearUsuarioRequest request) {
        try {
            // Guardar el usuario con los tipos de usuario asociados
            Usuario nuevoUsuario = usuarioService.crearUsuario(request.getUsuario(), request.getTiposUsuarioIds());
            return ResponseEntity.ok(nuevoUsuario);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(null);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body(null);
        }
    }
    

    // Obtener todos los usuarios
    @GetMapping
    public ResponseEntity<List<Usuario>> obtenerTodosLosUsuarios() {
        List<Usuario> usuarios = usuarioService.obtenerTodosLosUsuarios();
        return ResponseEntity.ok(usuarios);
    }

    // Obtener un usuario por ID
    @GetMapping("/{id}")
    public ResponseEntity<Usuario> obtenerUsuarioPorId(@PathVariable Long id) {
        Usuario usuario = usuarioService.obtenerUsuarioPorId(id);
        if (usuario != null) {
            return ResponseEntity.ok(usuario);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Actualizar un usuario
    @PutMapping("/{id}")
    public ResponseEntity<Usuario> actualizarUsuario(@PathVariable Long id, @RequestBody Usuario usuarioActualizado) {
        Usuario usuario = usuarioService.actualizarUsuario(id, usuarioActualizado);
        if (usuario != null) {
            return ResponseEntity.ok(usuario);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Eliminar un usuario
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarUsuario(@PathVariable Long id) {
        boolean eliminado = usuarioService.eliminarUsuario(id);
        if (eliminado) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Obtener usuarios por tipo de usuario
    @GetMapping("/tipo/{tipoUsuarioId}")
    public ResponseEntity<List<Usuario>> obtenerUsuariosPorTipoUsuario(@PathVariable Long tipoUsuarioId) {
        List<Usuario> usuarios = usuarioService.obtenerUsuariosPorTipoUsuario(tipoUsuarioId);
        return ResponseEntity.ok(usuarios);
    }
}

class CrearUsuarioRequest {
    private Usuario usuario;
    private List<Long> tiposUsuarioIds;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Long> getTiposUsuarioIds() {
        return tiposUsuarioIds;
    }

    public void setTiposUsuarioIds(List<Long> tiposUsuarioIds) {
        this.tiposUsuarioIds = tiposUsuarioIds;
    }
}
