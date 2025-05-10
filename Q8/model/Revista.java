package Q8.model;

public class Revista extends MaterialBiblioteca {
    public Revista(String titulo, int prazoDevolucao) {
        super(titulo, prazoDevolucao);
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 2.0;
    }
}
