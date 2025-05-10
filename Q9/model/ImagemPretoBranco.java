package Q9.model;

import Q9.model.Imagem;

public class ImagemPretoBranco extends Imagem {
    public ImagemPretoBranco(int largura, int altura) {
        super(largura, altura);
    }

    @Override
    public String processar() {
        return "Convertida para preto e branco.";
    }
}