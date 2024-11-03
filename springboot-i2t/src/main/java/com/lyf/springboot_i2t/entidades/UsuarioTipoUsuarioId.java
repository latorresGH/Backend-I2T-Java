package com.lyf.springboot_i2t.entidades;

import java.io.Serializable;
import java.util.Objects;

public class UsuarioTipoUsuarioId implements Serializable {
    private Long idUsuario; 
    private Long idTipoUsuario; 

    // Constructor, equals, hashCode
    public UsuarioTipoUsuarioId() {}

    public UsuarioTipoUsuarioId(Long idUsuario, Long idTipoUsuario) {
        this.idUsuario = idUsuario;
        this.idTipoUsuario = idTipoUsuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsuarioTipoUsuarioId that = (UsuarioTipoUsuarioId) o;
        return Objects.equals(idUsuario, that.idUsuario) && Objects.equals(idTipoUsuario, that.idTipoUsuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUsuario, idTipoUsuario);
    }
}
