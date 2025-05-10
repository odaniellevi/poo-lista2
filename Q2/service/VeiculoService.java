package Q2.service;

import Q2.exception.VeiculoInvalidoException;
import Q2.model.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class VeiculoService {
    private List<Veiculo> veiculos = new ArrayList<>();

    public void adicionarVeiculo(Veiculo veiculo) {
        if (veiculo == null) {
            throw new VeiculoInvalidoException("Veículo inválido.");
        }
        veiculos.add(veiculo);
    }

    public void listarInformacoes() {
        for (Veiculo v : veiculos) {
            v.informacoes();
        }
    }
}
