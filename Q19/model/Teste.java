package Q19.model;

public class Teste extends Tarefa {

    public Teste(String descricao) {
        super(descricao);
    }

    @Override
    public String realizarTarefa() {
        return "Realizando testes: " + descricao;
    }
}
