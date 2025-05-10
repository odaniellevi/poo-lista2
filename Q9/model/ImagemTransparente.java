package Q9.model;

public class ImagemTransparente extends Imagem {
    public ImagemTransparente(int largura, int altura) {
        super(largura, altura);
    }

    @Override
    public String processar() {
        return "Máscara de transparência aplicada.";
    }
}