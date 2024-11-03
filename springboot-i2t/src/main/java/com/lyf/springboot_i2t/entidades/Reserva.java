package com.lyf.springboot_i2t.entidades;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "RESERVA")
public class Reserva {

    @EmbeddedId
    private ReservaId id;

    @ManyToOne
    @MapsId("usuario") // Mapea el id de usuario en la clave compuesta
    @JoinColumn(name = "ID_USUARIO", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @MapsId("hospedaje") // Mapea el id de hospedaje en la clave compuesta
    @JoinColumn(name = "ID_HOSPEDAJE", nullable = false)
    private Hospedaje hospedaje;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_check_in", nullable = false)
    private Date fechaCheckIn;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_check_out", nullable = false)
    private Date fechaCheckOut;

    @Column(name = "cant_ninos", columnDefinition = "integer default 0")
    private Integer cantNinos;

    @Column(name = "cant_adultos", columnDefinition = "integer default 0")
    private Integer cantAdultos;

    @Column(name = "cant_bebes", columnDefinition = "integer default 0")
    private Integer cantBebes;

    @Column(name = "estado", nullable = false)
    private String estado;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_creacion", nullable = false)
    private Date fechaCreacion;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_modificacion")
    private Date fechaModificacion;

    // Getters y setters
    public ReservaId getId() {
        return id;
    }

    public void setId(ReservaId id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Hospedaje getHospedaje() {
        return hospedaje;
    }

    public void setHospedaje(Hospedaje hospedaje) {
        this.hospedaje = hospedaje;
    }

    public Date getFechaCheckIn() {
        return fechaCheckIn;
    }

    public void setFechaCheckIn(Date fechaCheckIn) {
        this.fechaCheckIn = fechaCheckIn;
    }

    public Date getFechaCheckOut() {
        return fechaCheckOut;
    }

    public void setFechaCheckOut(Date fechaCheckOut) {
        this.fechaCheckOut = fechaCheckOut;
    }

    public Integer getCantNinos() {
        return cantNinos;
    }

    public void setCantNinos(Integer cantNinos) {
        this.cantNinos = cantNinos;
    }

    public Integer getCantAdultos() {
        return cantAdultos;
    }

    public void setCantAdultos(Integer cantAdultos) {
        this.cantAdultos = cantAdultos;
    }

    public Integer getCantBebes() {
        return cantBebes;
    }

    public void setCantBebes(Integer cantBebes) {
        this.cantBebes = cantBebes;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }
}
