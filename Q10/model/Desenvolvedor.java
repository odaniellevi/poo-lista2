package Q10.model;

public class Desenvolvedor extends MembroEquipe {
    public Desenvolvedor(String nome, String projeto) {
        super(nome, projeto);
    }

    @Override
    public String trabalhar() {
        return "Escrevendo código para o projeto";
    }
}
