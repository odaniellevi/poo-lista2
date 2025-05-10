package Q7;

import Q7.model.*;
import Q7.service.GestorDeTransporte;
import Q7.exception.TransporteException;

public class Main {
    public static void main(String[] args) {
        GestorDeTransporte gestor = new GestorDeTransporte();

        Veiculo carro = new Carro(5, 120.0);
        Veiculo aviao = new Aviao(200, 900.0);
        Veiculo navio = new Navio(1000, 60.0);

        try {
            System.out.println(gestor.calcularViagem(carro, 300));
            System.out.println(gestor.calcularViagem(aviao, 3000));
            System.out.println(gestor.calcularViagem(navio, 600));
            System.out.println(gestor.calcularViagem(carro, -100)); // Exemplo de erro
        } catch (TransporteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

