package com.proyectoDesarrollo.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "emergencia")
public class Emergencia implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private long idEmergencia;
    private String titulo;
    private String detalle;

    public long getIdEmergencia() {
        return idEmergencia;
    }

    public void setIdEmergencia(long idEmergencia) {
        this.idEmergencia = idEmergencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
}
