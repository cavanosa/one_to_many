package com.tutorial.onetomany.service;

import com.tutorial.onetomany.entity.Marca;
import com.tutorial.onetomany.entity.Modelo;
import com.tutorial.onetomany.repository.MarcaRepository;
import com.tutorial.onetomany.repository.ModeloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService {

    @Autowired
    MarcaRepository marcaRepository;

    @Autowired
    ModeloRepository modeloRepository;

    public List<Marca> marcas(){
        return marcaRepository.findAll();
    }

    public List<Modelo> modelos(){
        return modeloRepository.findAll();
    }

    public void deleteMarca(int id){
        marcaRepository.deleteById(id);
    }
}
