package Q19.model;

public class Desenvolvimento extends Tarefa {

    public Desenvolvimento(String descricao) {
        super(descricao);
    }

    @Override
    public String realizarTarefa() {
        return "Desenvolvendo o software: " + descricao;
    }
}
