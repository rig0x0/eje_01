package com.upiiz.holamundo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Anotaciones - Decoraciones
@RestController
public class HolaMundoController {

    @GetMapping("/holamundo")
    public String holaMundo() {
        return "Hola Mundo de las APIs con el metodo GET";
    }

    @GetMapping("/holamundodos")
    public String holaMundo2() {
        return "Hola Mundo de las APIs DOS con el metodo GET";
    }
}
