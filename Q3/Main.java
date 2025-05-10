package Q3;

import Q3.model.*;
import Q3.service.EmpresaService;
import Q3.exception.FuncionarioInvalidoException;

public class Main {
    public static void main(String[] args) {
        EmpresaService empresa = new EmpresaService();

        try {
            empresa.adicionarFuncionario(new Gerente("Alice", 5000, 2000));
            empresa.adicionarFuncionario(new Desenvolvedor("Bob", 4000, 1.5));
            empresa.adicionarFuncionario(new Estagiario("Carlos", 0)); // Gera exceção
        } catch (FuncionarioInvalidoException e) {
            System.err.println("Erro: " + e.getMessage());
        }

        empresa.calcularFolhaDePagamento();
    }
}
