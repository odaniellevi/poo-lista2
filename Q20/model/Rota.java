package Q20.model;

import java.util.ArrayList;

public class Rota {
    private String origem;
    private String destino;
    private ArrayList<Veiculo> veiculosDisponiveis;

    public Rota(String origem, String destino) {
        this.origem = origem;
        this.destino = destino;
        this.veiculosDisponiveis = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculosDisponiveis.add(veiculo);
    }

    public String listarVeiculos(double distancia) {
        StringBuilder sb = new StringBuilder("Veículos disponíveis de " + origem + " até " + destino + ":\n");
        for (Veiculo v : veiculosDisponiveis) {
            sb.append("- ").append(v.getModelo())
                    .append(" (Capacidade: ").append(v.getCapacidade())
                    .append(") | Tempo estimado: ").append(String.format("%.2f", v.calcularTempo(distancia))).append(" h\n");
        }
        return sb.toString();
    }
}
