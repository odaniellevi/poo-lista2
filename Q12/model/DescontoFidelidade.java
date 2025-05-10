package Q12.model;

public class DescontoFidelidade implements EstrategiaDesconto {
    public double calcularDesconto(double preco) {
        return preco * 0.95;
    }
}