package com.lyf.springboot_i2t.entidades;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "TIPO_HOSPEDAJE")
public class TipoHospedaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 50)
    private String nombre;

    @OneToMany(mappedBy = "tipoHospedaje")
    private Set<Hospedaje> hospedajes;

    // Getters y setters
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

    public Set<Hospedaje> getHospedajes() {
        return hospedajes;
    }

    public void setHospedajes(Set<Hospedaje> hospedajes) {
        this.hospedajes = hospedajes;
    }
}
