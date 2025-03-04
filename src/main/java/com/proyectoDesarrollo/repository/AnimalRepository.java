package com.proyectoDesarrollo.repository;

import com.proyectoDesarrollo.domain.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Long>{
    
}
