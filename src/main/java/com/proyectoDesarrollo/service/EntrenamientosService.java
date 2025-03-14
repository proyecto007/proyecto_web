package com.proyectoDesarrollo.service;

import com.proyectoDesarrollo.domain.Entrenamientos;
import com.proyectoDesarrollo.repository.EntrenamientosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EntrenamientosService {

    @Autowired
    private EntrenamientosRepository entrenamientosRepository;

    @Transactional(readOnly = true)
    public List<Entrenamientos> listarEntrenamientos() {
        return entrenamientosRepository.findAll();
    }

    @Transactional
    public void guardar(Entrenamientos entrenamientos) {
        entrenamientosRepository.save(entrenamientos);
    }

    @Transactional(readOnly = true)
    public Entrenamientos encontrarEntrenamientos(Long id) {
        return entrenamientosRepository.findById(id).orElse(null);
    }

    @Transactional
    public void eliminar(Entrenamientos entrenamientos) {
        entrenamientosRepository.delete(entrenamientos);
    }
}



