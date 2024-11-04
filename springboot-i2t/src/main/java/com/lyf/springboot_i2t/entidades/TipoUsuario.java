package com.lyf.springboot_i2t.entidades;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "tipo_usuario")
public class TipoUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 50)
    private String nombre;

    @ManyToMany(mappedBy = "tiposUsuario")
    private List<Usuario> usuarios;

    // Constructor por defecto
    public TipoUsuario() {}

    // Constructor con parámetros
    public TipoUsuario(String nombre) {
        this.nombre = nombre;
    }

    // Getters y Setters
    public Long getId() { 
        return id;
    }

    public void setId(Long id) { 
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
