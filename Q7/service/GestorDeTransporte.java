package Q7.service;

import Q7.model.Veiculo;
import Q7.exception.TransporteException;

public class GestorDeTransporte {

    public String calcularViagem(Veiculo veiculo, double distancia) {
        if (distancia < 0) {
            throw new TransporteException("Distância não pode ser negativa.");
        }

        double tempo = veiculo.calcularTempo(distancia);
        String combustivel = veiculo.tipoDeCombustivel();
        return String.format("Veículo com capacidade de %d pessoas, tipo de combustível: %s, " +
                        "tempo de viagem para %.2f km: %.2f horas",
                veiculo.capacidade, combustivel, distancia, tempo);
    }
}
