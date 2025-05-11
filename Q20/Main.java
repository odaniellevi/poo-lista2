package Q20;

import Q20.model.*;
import Q20.service.ReservaService;

public class Main {
    public static void main(String[] args) {
        Rota rota = new Rota("São Paulo", "Rio de Janeiro");
        Veiculo onibus = new Onibus("Ônibus Executivo", 40);
        Veiculo carro = new Carro("Sedan Luxo", 4);
        Veiculo moto = new Moto("Moto Esportiva", 2);

        rota.adicionarVeiculo(onibus);
        rota.adicionarVeiculo(carro);
        rota.adicionarVeiculo(moto);

        ReservaService reservaService = new ReservaService();

        reservaService.reservarVeiculo((Reservavel) onibus, "2025-05-15", rota);
        reservaService.reservarVeiculo((Reservavel) carro, "2025-05-15", rota);
        reservaService.reservarVeiculo((Reservavel) moto, "2025-05-15", rota);

        System.out.println(rota.listarVeiculos(400));
    }
}

