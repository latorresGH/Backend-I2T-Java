package com.lyf.springboot_i2t.entidades;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "tipo_usuario")
public class TipoUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; // Cambiado a Integer para coincidir con INT en la tabla

    @Column(nullable = false, unique = true, length = 50)
    private String nombre;

    @ManyToMany(mappedBy = "tiposUsuario")
    private Set<Usuario> usuarios;

    // Constructor por defecto
    public TipoUsuario() {}

    // Constructor con parámetros
    public TipoUsuario(String nombre) {
        this.nombre = nombre;
    }

    // Getters y Setters
    public Integer getId() { 
        return id;
    }

    public void setId(Integer id) { 
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
