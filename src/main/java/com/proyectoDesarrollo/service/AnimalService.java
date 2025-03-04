package com.proyectoDesarrollo.service;

import com.proyectoDesarrollo.domain.Animal;
import com.proyectoDesarrollo.repository.AnimalRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    @Transactional(readOnly = true)
    public List<Animal> getAnimals(boolean activos) {
        var lista = animalRepository.findAll();
        return lista;
    }
}
