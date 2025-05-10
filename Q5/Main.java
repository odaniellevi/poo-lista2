package Q5;

import Q5.model.*;
import Q5.service.BancoService;

public class Main {
    public static void main(String[] args) {
        BancoService banco = new BancoService();

        Conta c1 = new ContaCorrente("João", 1000);
        ContaPoupanca c2 = new ContaPoupanca("Maria", 2000);
        Conta c3 = new ContaSalario("Pedro", 1500, 2);

        banco.adicionarConta(c1);
        banco.adicionarConta(c2);
        banco.adicionarConta(c3);

        c1.sacar(100);
        c2.sacar(300);
        c2.adicionarRendimento(5);
        c3.sacar(200);
        c3.sacar(100);

        banco.gerarRelatorio();
    }
}
