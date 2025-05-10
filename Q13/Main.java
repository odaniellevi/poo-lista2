package Q13;

import Q13.model.*;
import Q13.service.SistemaPagamento;

public class Main {
    public static void main(String[] args) {
        SistemaPagamento sistemaPagamento = new SistemaPagamento();

        ProcessadorPagamento processadorCartao = new ProcessadorCartao();
        ProcessadorPagamento processadorPix = new ProcessadorPix();
        ProcessadorPagamento processadorBoleto = new ProcessadorBoleto();

        System.out.println("Pagamento com Cartão:");
        sistemaPagamento.realizarPagamento(processadorCartao, 500.00);

        System.out.println("\nPagamento com PIX:");
        sistemaPagamento.realizarPagamento(processadorPix, 200.00);

        System.out.println("\nPagamento com Boleto:");
        sistemaPagamento.realizarPagamento(processadorBoleto, 15.00);
    }
}

