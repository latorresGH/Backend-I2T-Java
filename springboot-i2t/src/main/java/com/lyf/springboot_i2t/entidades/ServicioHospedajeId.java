package com.lyf.springboot_i2t.entidades;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ServicioHospedajeId implements Serializable {

    private int servicio; // Cambiado de Long a int
    private Long hospedaje; // Cambiado de Long a int

    // Constructores
    public ServicioHospedajeId() {}

    public ServicioHospedajeId(int servicio, Long hospedaje) {
        this.servicio = servicio;
        this.hospedaje = hospedaje;
    }

    // Getters y setters
    public int getServicio() {
        return servicio;
    }

    public void setServicio(int servicio) {
        this.servicio = servicio;
    }

    public Long getHospedaje() {
        return hospedaje;
    }

    public void setHospedaje(Long hospedaje) {
        this.hospedaje = hospedaje;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServicioHospedajeId that = (ServicioHospedajeId) o;
        return servicio == that.servicio && hospedaje == that.hospedaje;
    }

    @Override
    public int hashCode() {
        return Objects.hash(servicio, hospedaje);
    }
}
