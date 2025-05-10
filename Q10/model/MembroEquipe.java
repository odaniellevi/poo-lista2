package Q10.model;

public abstract class MembroEquipe {
    protected String nome;
    protected String projeto;

    public MembroEquipe(String nome, String projeto) {
        this.nome = nome;
        this.projeto = projeto;
    }

    public abstract String trabalhar();

    public String obterDetalhes() {
        return nome + " - Projeto: " + projeto;
    }

    public String getProjeto() {
        return projeto;
    }
}
