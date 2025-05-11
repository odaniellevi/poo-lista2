package Q16;

import Q16.model.*;
import Q16.service.RestauranteService;

public class Main {
    public static void main(String[] args) {
        RestauranteService service = new RestauranteService();

        PratoSimples prato = new PratoSimples("Arroz com Frango");

        service.adicionarIngredienteAoPrato(prato, new Carboidrato("Arroz", 150));
        service.adicionarIngredienteAoPrato(prato, new Proteina("Frango", 100));
        service.adicionarIngredienteAoPrato(prato, new Tempero("Alho", 5));

        System.out.println("Ingredientes:");
        System.out.println(service.exibirIngredientes(prato));

        System.out.println("Preparo:");
        System.out.println(service.prepararPrato(prato));
    }
}

