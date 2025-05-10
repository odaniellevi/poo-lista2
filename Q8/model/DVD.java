package Q8.model;

public class DVD extends MaterialBiblioteca {
    public DVD(String titulo, int prazoDevolucao) {
        super(titulo, prazoDevolucao);
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        return 5.0;
    }
}