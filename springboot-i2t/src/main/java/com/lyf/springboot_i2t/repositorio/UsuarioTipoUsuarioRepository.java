package com.lyf.springboot_i2t.repositorio;

import com.lyf.springboot_i2t.entidades.UsuarioTipoUsuario;
import com.lyf.springboot_i2t.entidades.UsuarioTipoUsuarioId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioTipoUsuarioRepository extends JpaRepository<UsuarioTipoUsuario, UsuarioTipoUsuarioId> {
}
