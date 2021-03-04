package com.tutorial.onetomany.controller;

import com.tutorial.onetomany.entity.Marca;
import com.tutorial.onetomany.entity.Modelo;
import com.tutorial.onetomany.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    MainService mainService;

    @GetMapping("/marcas")
    public ResponseEntity<List<Marca>> marcas(){
        List<Marca> marcas = mainService.marcas();
        return new ResponseEntity(marcas, HttpStatus.OK);
    }

    @GetMapping("/modelos")
    public ResponseEntity<List<Modelo>> modelos(){
        List<Modelo> modelos = mainService.modelos();
        return new ResponseEntity(modelos, HttpStatus.OK);
    }

    @DeleteMapping("/deletemarca/{id}")
    public ResponseEntity<?> deleteMarca(@PathVariable("id") int id){
        mainService.deleteMarca(id);
        return new ResponseEntity("marca eliminada", HttpStatus.OK);
    }
}
