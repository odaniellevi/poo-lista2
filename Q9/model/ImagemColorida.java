package Q9.model;

public class ImagemColorida extends Imagem {
    public ImagemColorida(int largura, int altura) {
        super(largura, altura);
    }

    @Override
    public String processar() {
        return "Filtro de saturação aplicado.";
    }
}
