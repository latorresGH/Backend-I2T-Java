package com.lyf.springboot_i2t.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "SERVICIO_HOSPEDAJE")
public class ServicioHospedaje {

    @EmbeddedId
    private ServicioHospedajeId id;

    @ManyToOne
    @MapsId("servicio") // Mapea el campo 'servicio' de ServicioHospedajeId
    @JoinColumn(name = "ID_SERVICIO")
    private Servicio servicio;

    @ManyToOne
    @MapsId("hospedaje") // Mapea el campo 'hospedaje' de ServicioHospedajeId
    @JoinColumn(name = "ID_HOSPEDAJE")
    private Hospedaje hospedaje;

    // Getters y setters
    public ServicioHospedajeId getId() {
        return id;
    }

    public void setId(ServicioHospedajeId id) {
        this.id = id;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Hospedaje getHospedaje() {
        return hospedaje;
    }

    public void setHospedaje(Hospedaje hospedaje) {
        this.hospedaje = hospedaje;
    }
}
