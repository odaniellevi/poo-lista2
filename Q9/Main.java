package Q9;

import Q9.model.*;
import Q9.service.EditorImagem;

public class Main {
    public static void main(String[] args) {
        Imagem img1 = new ImagemColorida(800, 600);
        Imagem img2 = new ImagemPretoBranco(1024, 768);
        Imagem img3 = new ImagemTransparente(640, 480);

        EditorImagem editor = new EditorImagem();

        System.out.println(editor.exibirInformacoes(img1));
        System.out.println(editor.exibirInformacoes(img2));
        System.out.println(editor.exibirInformacoes(img3));

        Imagem novaImg = editor.ajustarImagem(img1, 1920, 1080);
        System.out.println(editor.exibirInformacoes(novaImg));
    }
}

