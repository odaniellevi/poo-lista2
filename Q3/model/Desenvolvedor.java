package Q3.model;

public class Desenvolvedor extends Funcionario {
    private double fatorProdutividade;

    public Desenvolvedor(String nome, double salarioBase, double fatorProdutividade) {
        super(nome, salarioBase);
        this.fatorProdutividade = fatorProdutividade;
    }

    @Override
    public double calcularSalario() {
        return salarioBase * fatorProdutividade;
    }
}
