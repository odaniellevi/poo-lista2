package Q12.model;

public class DescontoSazonal implements EstrategiaDesconto {
    public double calcularDesconto(double preco) {
        return preco * 0.90;
    }
}
