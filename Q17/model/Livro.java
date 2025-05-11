package Q17.model;

public class Livro extends Material {
    public Livro(String titulo) {
        super(titulo);
    }

    @Override
    public String informarMaterial() {
        return "Livro: " + getTitulo();
    }
}
