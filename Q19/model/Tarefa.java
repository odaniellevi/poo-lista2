package Q19.model;

public abstract class Tarefa {
    protected String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public abstract String realizarTarefa();
}
