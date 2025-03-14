
package com.proyectoDesarrollo.controller;

import com.proyectoDesarrollo.domain.Cuidados;
import com.proyectoDesarrollo.service.CuidadosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CuidadosController {
     @Autowired
    private CuidadosService cuidadosService;

    @GetMapping("/cuidados")
    public String cuidados(Model model) {
        var cuidados = cuidadosService.listarCuidados();
        model.addAttribute("cuidados", cuidados);
        return "cuidados/listado";
    }
 
}
