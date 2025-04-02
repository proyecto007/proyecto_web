/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoDesarrollo.controller;
//import com.tienda.service.FirebaseStorageService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller //Pasa información a los archv html
@RequestMapping("/Horario")
public class HorarioController {

    @GetMapping("/listado")
    public String mostrarListado() {
        return "/Horario/listado";
    }
}