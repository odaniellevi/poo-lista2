package Q2;

import Q2.model.*;
import Q2.service.VeiculoService;
import Q2.exception.VeiculoInvalidoException;

public class Main {
    public static void main(String[] args) {
        VeiculoService service = new VeiculoService();

        try {
            service.adicionarVeiculo(new Carro("Toyota", "Corolla", 2020, 4));
            service.adicionarVeiculo(new Motocicleta("Yamaha", "MT-07", 2022, "Esportivo"));
            service.adicionarVeiculo(null); // Vai gerar exceção
        } catch (VeiculoInvalidoException e) {
            System.err.println("Erro: " + e.getMessage());
        }

        service.listarInformacoes();
    }
}
