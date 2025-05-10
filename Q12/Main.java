package Q12;

import Q12.model.*;
import Q12.service.GestorDeDescontos;

public class Main {
    public static void main(String[] args) {
        GestorDeDescontos gestor = new GestorDeDescontos();

        double precoOriginal = 100.0;

        double valorFidelidade = gestor.aplicarDesconto(new DescontoFidelidade(), precoOriginal);
        double valorSazonal = gestor.aplicarDesconto(new DescontoSazonal(), precoOriginal);
        double valorPromocional = gestor.aplicarDesconto(new DescontoPromocional(), precoOriginal);

        System.out.println("Desconto Fidelidade: R$ " + valorFidelidade);
        System.out.println("Desconto Sazonal: R$ " + valorSazonal);
        System.out.println("Desconto Promocional: R$ " + valorPromocional);
    }
}

