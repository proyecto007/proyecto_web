
package com.proyectoDesarrollo.controller;

import com.proyectoDesarrollo.service.CampaniaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping; //# si es del achv de mensaje
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //Pasa información a los archv html
@RequestMapping("/campania")
public class CampaniaController {
    @Autowired
    private CampaniaService campaniaService;
         
  
    @GetMapping("/listado")
    public String listado(Model model) {
        var lista=campaniaService.getCampanias(false);
        model.addAttribute("campanias", lista);
        return "/campania/listado";
    }
}
