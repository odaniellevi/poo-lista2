package Q17.model;

public abstract class Material {
    protected String titulo;

    public Material(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public abstract String informarMaterial();
}