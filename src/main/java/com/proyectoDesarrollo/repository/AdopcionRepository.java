package com.proyectoDesarrollo.repository;

import com.proyectoDesarrollo.domain.Adopcion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdopcionRepository extends JpaRepository<Adopcion, Long>{
    
}
