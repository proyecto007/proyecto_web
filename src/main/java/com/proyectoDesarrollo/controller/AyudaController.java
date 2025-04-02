package com.proyectoDesarrollo.controller;
//import com.tienda.service.FirebaseStorageService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller //Pasa información a los archv html
@RequestMapping("/ayuda")
public class AyudaController {

    @GetMapping("/listado")
    public String mostrarListado() {
        return "/ayuda/listado";
    }
    @GetMapping("/listado2")
    public String listado2() {
        return "/ayuda/listado2";
    }
    @GetMapping("/listado3")
    public String listado3() {
        return "/ayuda/listado3";
    }
}
