
package com.proyectoDesarrollo.service;

import com.proyectoDesarrollo.domain.Campania;
import com.proyectoDesarrollo.repository.CampaniaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CampaniaService {
     @Autowired
    private CampaniaRepository campaniaRepository;

    @Transactional(readOnly = true)
    public List<Campania> getCampanias(boolean activos) {
        var lista = campaniaRepository.findAll();
        return lista;
    }
}
