package Q3.service;

import Q3.model.Funcionario;
import Q3.exception.FuncionarioInvalidoException;

import java.util.ArrayList;
import java.util.List;

public class EmpresaService {
    private List<Funcionario> funcionarios = new ArrayList<>();

    public void adicionarFuncionario(Funcionario funcionario) {
        if (funcionario == null || funcionario.calcularSalario() <= 0) {
            throw new FuncionarioInvalidoException("Funcionário inválido ou salário incorreto.");
        }
        funcionarios.add(funcionario);
    }

    public void calcularFolhaDePagamento() {
        System.out.println("Folha de pagamento:");
        for (Funcionario f : funcionarios) {
            System.out.printf("%s: R$ %.2f\n", f.getNome(), f.calcularSalario());
        }
    }
}