package com.lyf.springboot_i2t.services;

import com.lyf.springboot_i2t.entidades.UsuarioTipoUsuario;
import com.lyf.springboot_i2t.entidades.UsuarioTipoUsuarioId;
import java.util.List;
import java.util.Optional;

public interface UsuarioTipoUsuarioService {
    List<UsuarioTipoUsuario> findAll();
    Optional<UsuarioTipoUsuario> findById(UsuarioTipoUsuarioId id);
    UsuarioTipoUsuario save(UsuarioTipoUsuario usuarioTipoUsuario);
    void deleteById(UsuarioTipoUsuarioId id);
}
