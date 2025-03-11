
package com.proyectoDesarrollo.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "campania")
public class Campania implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long idCampania;
    private String direccion;
    private String fecha;
    private String horaInicio;
    private String horaFinal;
    private String imagenPrecios;
    private String imagenRequisitos;

    public Long getIdCampania() {
        return idCampania;
    }

    public void setIdCampania(Long idCampania) {
        this.idCampania = idCampania;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(String horaFinal) {
        this.horaFinal = horaFinal;
    }

    public String getImagenPrecios() {
        return imagenPrecios;
    }

    public void setImagenPrecios(String imagenPrecios) {
        this.imagenPrecios = imagenPrecios;
    }

    public String getImagenRequisitos() {
        return imagenRequisitos;
    }

    public void setImagenRequisitos(String imagenRequisitos) {
        this.imagenRequisitos = imagenRequisitos;
    }
    
}
