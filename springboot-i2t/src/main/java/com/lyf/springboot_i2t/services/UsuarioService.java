package com.lyf.springboot_i2t.services;

import com.lyf.springboot_i2t.entidades.Usuario;
import java.util.List;

public interface UsuarioService {
    Usuario crearUsuario(Usuario usuario, List<Long> tiposUsuarioIds); // Ajustado para aceptar tiposUsuarioIds
    List<Usuario> obtenerTodosLosUsuarios();
    Usuario obtenerUsuarioPorId(Long id);
    Usuario actualizarUsuario(Long id, Usuario usuarioActualizado);
    boolean eliminarUsuario(Long id);
    List<Usuario> obtenerUsuariosPorTipoUsuario(Long tipoUsuarioId);
}
