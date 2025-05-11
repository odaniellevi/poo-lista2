package Q19.model;

public class Design extends Tarefa {

    public Design(String descricao) {
        super(descricao);
    }

    @Override
    public String realizarTarefa() {
        return "Criando o design: " + descricao;
    }
}
