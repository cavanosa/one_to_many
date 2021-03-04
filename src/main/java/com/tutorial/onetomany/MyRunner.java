package com.tutorial.onetomany;

import com.tutorial.onetomany.entity.Marca;
import com.tutorial.onetomany.entity.Modelo;
import com.tutorial.onetomany.repository.MarcaRepository;
import com.tutorial.onetomany.repository.ModeloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    MarcaRepository marcaRepository;

    @Autowired
    ModeloRepository modeloRepository;

    @Override
    public void run(String... args) throws Exception {
        /*Marca mercedes = new Marca("Mercedes");
        Marca bmw = new Marca("BMW");
        Modelo claseC = new Modelo("Clase C");
        Modelo claseE = new Modelo("Clase E");
        Modelo serie3 = new Modelo("Serie 3");
        Modelo serie5 = new Modelo("serie 5");

        claseC.setMarca(mercedes);
        claseE.setMarca(mercedes);
        serie3.setMarca(bmw);
        serie5.setMarca(bmw);

        Set<Modelo> modelosM = new HashSet<>();
        Set<Modelo> modelosB = new HashSet<>();

        modelosM.add(claseC);
        modelosM.add(claseE);
        modelosB.add(serie3);
        modelosB.add(serie5);

        mercedes.setModelos(modelosM);
        bmw.setModelos(modelosB);

        marcaRepository.save(mercedes);
        marcaRepository.save(bmw);*/

        /*Marca mercedes = marcaRepository.findById(1).get();
        mercedes.getModelos().stream().forEach(m -> System.out.println(m.getName()));*/


    }
}
