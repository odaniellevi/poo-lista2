package Q1;

import Q1.model.*;
import Q1.service.ZoologicoService;
import Q1.exception.AnimalInvalidoException;

public class Main {
    public static void main(String[] args) {
        ZoologicoService zoologico = new ZoologicoService();

        try {
            zoologico.adicionarAnimal(new Cachorro("Rex"));
            zoologico.adicionarAnimal(new Gato("Mimi"));
            zoologico.adicionarAnimal(null); // Vai lançar exceção
        } catch (AnimalInvalidoException e) {
            System.err.println("Erro: " + e.getMessage());
        }

        zoologico.emitirSons();
    }
}

