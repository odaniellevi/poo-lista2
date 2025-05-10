package Q12.model;

public class DescontoPromocional implements EstrategiaDesconto {
    public double calcularDesconto(double preco) {
        double resultado = preco - 20.0;
        return resultado < 0 ? 0 : resultado;
    }
}
