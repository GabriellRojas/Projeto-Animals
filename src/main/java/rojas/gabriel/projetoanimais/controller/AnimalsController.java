package rojas.gabriel.projetoanimais.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import rojas.gabriel.projetoanimais.model.Animals;

import java.util.ArrayList;

@RestController
public class AnimalsController {

    @GetMapping("/animals")
    public Animals animal() {
        Animals animal = new Animals();

        animal.setName("Gato");
        animal.setHabitat("Selvas, florestas, doméstico");
        animal.setSpecie("Felis catus");
        animal.setFamily("Felidae");

        return animal;
    }

    @GetMapping("/cadastro")
    public ArrayList<Animals>animals() {

        Animals animal1 = new Animals();

        animal1.setName("Gato");
        animal1.setHabitat("Selvas, florestas, doméstico");
        animal1.setSpecie("Felis catus");
        animal1.setFamily("Felidae");

        Animals animal2 = new Animals();

        animal2.setName("Lontra");
        animal2.setHabitat("Rios");
        animal2.setSpecie("Lutrinae");
        animal2.setFamily("Mustelidae");

        Animals animal3 = new Animals();

        animal3.setName("Guepardo");
        animal3.setHabitat("Savana");
        animal3.setSpecie("Acinonyx jubatus");
        animal3.setFamily("Felidae");

        ArrayList<Animals> register = new ArrayList();

        register.add(animal1);
        register.add(animal2);
        register.add(animal3);

        return register;

    }

}
