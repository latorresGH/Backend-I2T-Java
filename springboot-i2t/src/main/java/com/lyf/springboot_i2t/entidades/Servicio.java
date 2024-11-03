package com.lyf.springboot_i2t.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "SERVICIO")
public class Servicio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") // Debe coincidir con el nombre de la columna en la base de datos
    private int id; // Cambiado de Long a Integer

    private String nombre; // Otros atributos según sea necesario

    // Getters y setters
    public int getId() { // Cambiado de Long a Integer
        return id;
    }

    public void setId(int id) { // Cambiado de Long a Integer
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
