package Q8.model;

public abstract class MaterialBiblioteca {
    protected String titulo;
    protected int prazoDevolucao;

    public MaterialBiblioteca(String titulo, int prazoDevolucao) {
        this.titulo = titulo;
        this.prazoDevolucao = prazoDevolucao;
    }

    public abstract double calcularMulta(int diasAtraso);

    public String getTitulo() {
        return titulo;
    }

    public int getPrazoDevolucao() {
        return prazoDevolucao;
    }
}
