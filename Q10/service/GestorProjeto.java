package Q10.service;

import Q10.model.MembroEquipe;
import Q10.exception.ProjetoException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GestorProjeto {
    private List<MembroEquipe> membros = new ArrayList<>();

    public void adicionarMembro(MembroEquipe membro) {
        if (membro == null) {
            throw new ProjetoException("Membro inválido");
        }
        membros.add(membro);
    }

    public String exibirRelatorio(MembroEquipe membro) {
        return membro.obterDetalhes() + " - Tarefa: " + membro.trabalhar();
    }

    public List<MembroEquipe> listarEquipePorProjeto(String projeto) {
        return membros.stream()
                .filter(m -> m.getProjeto().equalsIgnoreCase(projeto))
                .collect(Collectors.toList());
    }
}
