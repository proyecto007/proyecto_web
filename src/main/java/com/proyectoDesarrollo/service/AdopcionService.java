package com.proyectoDesarrollo.service;

import com.proyectoDesarrollo.domain.Adopcion;
import com.proyectoDesarrollo.repository.AdopcionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AdopcionService {

    @Autowired
    private AdopcionRepository adopcionRepository;

    @Transactional(readOnly = true)
    public List<Adopcion> getAdopcions(boolean activos) {
        var lista = adopcionRepository.findAll();
        return lista;
    }
}

