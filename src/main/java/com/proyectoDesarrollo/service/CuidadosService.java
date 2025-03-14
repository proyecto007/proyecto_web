package com.proyectoDesarrollo.service;

import com.proyectoDesarrollo.domain.Cuidados;
import com.proyectoDesarrollo.repository.CuidadosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CuidadosService {
    @Autowired
    private CuidadosRepository cuidadosRepository;

    @Transactional(readOnly = true)
    public List<Cuidados> listarCuidados() {
        return cuidadosRepository.findAll();
    }

    @Transactional
    public void guardar(Cuidados cuidados) {
        cuidadosRepository.save(cuidados);
    }

    @Transactional(readOnly = true)
    public Cuidados encontrarCuidados(Long id) {
        return cuidadosRepository.findById(id).orElse(null);
    }

    @Transactional
    public void eliminar(Cuidados cuidados) {
        cuidadosRepository.delete(cuidados);
    }
}
