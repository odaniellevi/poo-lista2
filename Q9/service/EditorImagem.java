package Q9.service;

import Q9.exception.ImagemException;
import Q9.model.Imagem;

public class EditorImagem {
    public String exibirInformacoes(Imagem imagem) {
        return "Largura: " + imagem.getLargura() +
                ", Altura: " + imagem.getAltura() +
                ", Processamento: " + imagem.processar();
    }

    public Imagem ajustarImagem(Imagem imagem, int novaLargura, int novaAltura) {
        if (novaLargura <= 0 || novaAltura <= 0) {
            throw new ImagemException("Dimensões inválidas");
        }

        return new Imagem(novaLargura, novaAltura) {
            @Override
            public String processar() {
                return imagem.processar();
            }
        };
    }
}
