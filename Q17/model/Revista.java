package Q17.model;

public class Revista extends Material {
    public Revista(String titulo) {
        super(titulo);
    }

    @Override
    public String informarMaterial() {
        return "Revista: " + getTitulo();
    }
}