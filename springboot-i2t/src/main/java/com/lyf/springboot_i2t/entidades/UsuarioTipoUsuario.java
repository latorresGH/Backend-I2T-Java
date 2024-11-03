package com.lyf.springboot_i2t.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario_tipo_usuario")
@IdClass(UsuarioTipoUsuarioId.class)
public class UsuarioTipoUsuario {

    @Id
    @Column(name = "ID_TIPO_USUARIO") 
    private Long idTipoUsuario; // Cambiado a Long para coincidir con BIGINT

    @Id
    @Column(name = "ID_USUARIO") 
    private Long idUsuario; // Sigue siendo Long para BIGINT

    @ManyToOne
    @JoinColumn(name = "ID_USUARIO", nullable = false, insertable = false, updatable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "ID_TIPO_USUARIO", nullable = false, insertable = false, updatable = false)
    private TipoUsuario tipoUsuario;

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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
}
