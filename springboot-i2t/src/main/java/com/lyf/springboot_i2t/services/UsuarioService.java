package com.lyf.springboot_i2t.services;

import com.lyf.springboot_i2t.entidades.Usuario;
import java.util.List;

public interface UsuarioService {
    Usuario guardarUsuario(Usuario usuario);
    List<Usuario> obtenerTodosLosUsuarios();
    Usuario obtenerUsuarioPorId(Long id);
    Usuario actualizarUsuario(Long id, Usuario usuarioActualizado);
    boolean eliminarUsuario(Long id);

    // Nuevo método para buscar por tipo de usuario
    List<Usuario> obtenerUsuariosPorTipoUsuario(Long tipoUsuarioId);
}
