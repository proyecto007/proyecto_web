package com.proyectoDesarrollo.controller;
//import com.tienda.service.FirebaseStorageService;

import com.proyectoDesarrollo.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping; //# si es del achv de mensaje
import org.springframework.web.bind.annotation.RequestMapping; //$ si es un atributo del modelo
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller //Pasa información a los archv html
@RequestMapping("/animal")
public class AnimalController {

    @Autowired
    private AnimalService animalService;
         
  
    @GetMapping("/listado")
    public String listado(Model model) {
        var lista=animalService.getAnimals(false);
        model.addAttribute("animals", lista);
        return "/animal/listado";
    }
}
