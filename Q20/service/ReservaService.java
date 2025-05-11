package Q20.service;

import Q20.model.Reservavel;
import Q20.model.Rota;
import Q20.exception.ReservaException;

public class ReservaService {
    public void reservarVeiculo(Reservavel veiculo, String data, Rota rota) {
        if (!veiculo.reservar(data, rota)) {
            throw new ReservaException("Não foi possível reservar o veículo na data " + data);
        }
    }
}
