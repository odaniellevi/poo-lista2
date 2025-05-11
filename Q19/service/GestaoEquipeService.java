package Q19.service;

import Q19.model.MembroEquipe;
import Q19.exception.TarefaException;
import Q19.model.Tarefa;

public class GestaoEquipeService {

    public void adicionarTarefa(MembroEquipe membro, Tarefa tarefa) {
        try {
            if (membro == null || tarefa == null) {
                throw new TarefaException("Membro ou tarefa inválido.");
            }
            membro.adicionarTarefa(tarefa);
        } catch (TarefaException e) {
            System.out.println(e.getMessage());
        }
    }
}
