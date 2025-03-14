package com.proyectoDesarrollo.controller;

import com.proyectoDesarrollo.domain.Entrenamientos;
import com.proyectoDesarrollo.service.EntrenamientosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EntrenamientosController {
    @Autowired
    private EntrenamientosService entrenamientosService;

    @GetMapping("/entrenamientos")
    public String entrenamientos(Model model) {
        var entrenamientos = entrenamientosService.listarEntrenamientos();
        model.addAttribute("entrenamientos", entrenamientos);
        return "entrenamientos/listado";
    }

    @GetMapping("/entrenamiento/nuevo")
    public String nuevo(Entrenamientos entrenamientos) {
        return "entrenamientos/modificar";
    }

    @PostMapping("/entrenamiento/guardar")
    public String guardar(Entrenamientos entrenamientos) {
        entrenamientosService.guardar(entrenamientos);
        return "redirect:/entrenamiento";
    }

    @GetMapping("/entrenamiento/editar/{id}")
    public String editar(Entrenamientos entrenamientos, Model model) {
        entrenamientos = entrenamientosService.encontrarEntrenamientos(entrenamientos.getId());
        model.addAttribute("entrenamiento", entrenamientos);
        return "entrenamientos/modificar";
    }

    @GetMapping("/entrenamiento/eliminar/{id}")
    public String eliminar(Entrenamientos entrenamientos) {
        entrenamientosService.eliminar(entrenamientos);
        return "redirect:/entrenamiento";
    }
}
