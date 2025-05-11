package Q17.model;

public class DVD extends Material {
    public DVD(String titulo) {
        super(titulo);
    }

    @Override
    public String informarMaterial() {
        return "DVD: " + getTitulo();
    }
}