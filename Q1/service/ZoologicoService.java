package Q1.service;

import Q1.exception.AnimalInvalidoException;
import Q1.model.Animal;

import java.util.ArrayList;
import java.util.List;

public class ZoologicoService {
    private List<Animal> animais = new ArrayList<>();

    public void adicionarAnimal(Animal animal) {
        if (animal == null) {
            throw new AnimalInvalidoException("Animal não pode ser nulo.");
        }
        animais.add(animal);
    }

    public void emitirSons() {
        for (Animal a : animais) {
            a.som();
        }
    }
}
