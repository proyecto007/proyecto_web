package com.proyectoDesarrollo.repository;

import com.proyectoDesarrollo.domain.Emergencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmergenciaRepository extends JpaRepository<Emergencia, Long>{
    
}
