package Q9.model;

public abstract class Imagem {
    protected int largura;
    protected int altura;

    public Imagem(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public int calcularTamanho() {
        return largura * altura;
    }

    public abstract String processar();

    public int getLargura() {
        return largura;
    }

    public int getAltura() {
        return altura;
    }
}
