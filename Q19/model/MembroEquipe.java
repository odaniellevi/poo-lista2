package Q19.model;

import java.util.ArrayList;

public class MembroEquipe {
    private String nome;
    private Papel papel;
    private ArrayList<Tarefa> tarefas;

    public MembroEquipe(String nome, Papel papel) {
        this.nome = nome;
        this.papel = papel;
        this.tarefas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public Papel getPapel() {
        return papel;
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public String listarTarefas() {
        StringBuilder lista = new StringBuilder("Tarefas de " + nome + " (" + papel.executarPapel() + "):\n");
        for (Tarefa tarefa : tarefas) {
            lista.append(tarefa.realizarTarefa()).append("\n");
        }
        return lista.toString();
    }
}