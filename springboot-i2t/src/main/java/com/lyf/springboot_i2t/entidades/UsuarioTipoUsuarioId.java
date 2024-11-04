package com.lyf.springboot_i2t.entidades;

import java.io.Serializable;
import java.util.Objects;

public class UsuarioTipoUsuarioId implements Serializable {
    private Long idTipoUsuario;
    private Long idUsuario;

    public UsuarioTipoUsuarioId() {}

    public UsuarioTipoUsuarioId(Long idTipoUsuario, Long idUsuario) {
        this.idTipoUsuario = idTipoUsuario;
        this.idUsuario = idUsuario;
    }

    // Getters y Setters

    public Long getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(Long idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    // Implementar hashCode y equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UsuarioTipoUsuarioId)) return false;
        UsuarioTipoUsuarioId that = (UsuarioTipoUsuarioId) o;
        return Objects.equals(idTipoUsuario, that.idTipoUsuario) &&
               Objects.equals(idUsuario, that.idUsuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTipoUsuario, idUsuario);
    }
}
