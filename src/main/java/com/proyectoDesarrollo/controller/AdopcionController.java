package com.proyectoDesarrollo.controller;

import com.proyectoDesarrollo.service.AdopcionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping; //# si es del achv de mensaje
import org.springframework.web.bind.annotation.RequestMapping; //$ si es un atributo del modelo
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/adopcion")
public class AdopcionController {

    @Autowired
    private AdopcionService adopcionService;

    @GetMapping("/listado")
    public String listado(Model model) {
        var lista = adopcionService.getAdopcions(false);
        model.addAttribute("adopcions", lista);
        return "/adopcion/listado";
    }

}
