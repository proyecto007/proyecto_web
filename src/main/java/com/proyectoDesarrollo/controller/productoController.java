
package com.proyectoDesarrollo.controller;

//import com.tienda.service.FirebaseStorageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //Pasa información a los archv html
@RequestMapping("/producto")
public class productoController {

    @GetMapping("/listado")
    public String mostrarListado() {
        return "/producto/listado";
    }
}