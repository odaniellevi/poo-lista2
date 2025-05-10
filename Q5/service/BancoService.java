package Q5.service;

import Q5.model.*;
import java.util.ArrayList;
import java.util.List;

public class BancoService {
    private List<Conta> contas = new ArrayList<>();

    public void adicionarConta(Conta conta) {
        if (conta == null) throw new RuntimeException("Conta nula.");
        contas.add(conta);
    }

    public void gerarRelatorio() {
        for (Conta conta : contas) {
            System.out.println("Titular: " + conta.getTitular());
            System.out.println("Saldo: R$ " + conta.getSaldo());

            if (conta instanceof ContaCorrente) {
                System.out.println("Tipo: Conta Corrente");
            } else if (conta instanceof ContaPoupanca) {
                System.out.println("Tipo: Conta Poupança");
            } else if (conta instanceof ContaSalario) {
                System.out.println("Tipo: Conta Salário");
                System.out.println("Saques restantes: " + ((ContaSalario) conta).getSaquesRestantes());
            }

            System.out.println("--------------------");
        }
    }
}