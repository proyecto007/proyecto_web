package com.proyectoDesarrollo.service;

import com.proyectoDesarrollo.domain.Ayuda;
import com.proyectoDesarrollo.repository.AyudaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AyudaService {

    @Autowired
    private AyudaRepository ayudaRepository;

    @Transactional(readOnly = true)
    public List<Ayuda> getAyudas(boolean activos) {
        var lista = ayudaRepository.findAll();
        return lista;
    }
}

