package Q15;

import Q15.model.ControleAutonomo;
import Q15.model.ControleCarro;
import Q15.model.ControleDrone;
import Q15.model.ControleNavio;
import Q15.service.SistemaAutonomo;

public class Main {
    public static void main(String[] args) {
        ControleAutonomo carro = new ControleCarro();
        ControleAutonomo drone = new ControleDrone();
        ControleAutonomo navio = new ControleNavio();

        SistemaAutonomo sistema = new SistemaAutonomo();

        System.out.println(sistema.navegar(carro, "Avenida Central", 60.0));
        System.out.println(sistema.navegar(drone, "Ponto de Entrega Aéreo", 40.0));
        System.out.println(sistema.navegar(navio, "Porto Sul", 25.0));
    }
}

