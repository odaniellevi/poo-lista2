package Q19;

import Q19.model.*;
import Q19.service.GestaoEquipeService;

public class Main {
    public static void main(String[] args) {
        // Criando membros e tarefas
        MembroEquipe membro1 = new MembroEquipe("Alice", new Papel() {
            @Override
            public String executarPapel() {
                return "Desenvolvedor";
            }
        });
        MembroEquipe membro2 = new MembroEquipe("Bob", new Papel() {
            @Override
            public String executarPapel() {
                return "Designer";
            }
        });

        Tarefa tarefa1 = new Desenvolvimento("Implementar nova funcionalidade");
        Tarefa tarefa2 = new Design("Criar protótipo de interface");
        Tarefa tarefa3 = new Teste("Testar novas funcionalidades");

        GestaoEquipeService gestaoEquipeService = new GestaoEquipeService();

        // Atribuindo tarefas aos membros
        gestaoEquipeService.adicionarTarefa(membro1, tarefa1);
        gestaoEquipeService.adicionarTarefa(membro2, tarefa2);
        gestaoEquipeService.adicionarTarefa(membro1, tarefa3);

        // Listando as tarefas dos membros
        System.out.println(membro1.listarTarefas());
        System.out.println(membro2.listarTarefas());
    }
}
