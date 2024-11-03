package com.lyf.springboot_i2t.entidades;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ReservaId implements Serializable {
    private Long usuario; // ID del Usuario
    private Long hospedaje; // ID del Hospedaje

    // Constructor vacío
    public ReservaId() {}

    // Getters y Setters
    public Long getUsuario() {
        return usuario;
    }

    public void setUsuario(Long usuario) {
        this.usuario = usuario;
    }

    public Long getHospedaje() {
        return hospedaje;
    }

    public void setHospedaje(Long hospedaje) {
        this.hospedaje = hospedaje;
    }

    // Implementa equals() y hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ReservaId)) return false;
        ReservaId that = (ReservaId) o;
        return Objects.equals(usuario, that.usuario) && 
               Objects.equals(hospedaje, that.hospedaje);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usuario, hospedaje);
    }
}
