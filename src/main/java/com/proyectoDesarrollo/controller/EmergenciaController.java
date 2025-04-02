package com.proyectoDesarrollo.controller;

import com.proyectoDesarrollo.service.EmergenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping; //$ si es un atributo del modelo

@Controller //Pasa información a los archv html
@RequestMapping("/emergencia")
public class EmergenciaController {

    @Autowired
    private EmergenciaService emergenciaService;
         
    @GetMapping("/listado")
    public String listado(Model model) {
        var lista=emergenciaService.getEmergencias(false);
        model.addAttribute("emergencias", lista);
        return "/emergencia/listado";
    }
}
