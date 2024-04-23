package com.example.almacenadospruebita.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.almacenadospruebita.entity.Comida;
import com.example.almacenadospruebita.service.ComidaService;

@RestController
@RequestMapping("/comida")
public class ComidaController {

    @Autowired
    private ComidaService comidaService;


    @PutMapping("/{id}/principalingrediente")
    public ResponseEntity<String> actualizarPrincipalingrediente(@PathVariable Long id, @RequestBody String nuevoCelular) {
        try {
            comidaService.actualizarPrincipalingrediente(id, nuevoCelular);
            return ResponseEntity.ok("Ingrediente actualizado con ID: " + id);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al actualizar el ingrediente principal de la comida con ID: " + id);
        }

    }

    @PostMapping("/agregar")
    public Comida añadirComida(@RequestBody Comida comida){
        // return new Comida();
        return comidaService.añadirComida(comida);
    }

    
}
