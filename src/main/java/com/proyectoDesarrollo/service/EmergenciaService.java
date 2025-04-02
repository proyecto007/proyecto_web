package com.proyectoDesarrollo.service;

import com.proyectoDesarrollo.domain.Emergencia;
import com.proyectoDesarrollo.repository.EmergenciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmergenciaService {

    @Autowired
    private EmergenciaRepository emergenciaRepository;

    @Transactional(readOnly = true)
    public List<Emergencia> getEmergencias(boolean activos) {
        var lista = emergenciaRepository.findAll();
        return lista;
    }
}
