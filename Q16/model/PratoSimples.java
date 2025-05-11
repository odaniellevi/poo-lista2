package Q16.model;

public class PratoSimples extends Prato implements Preparo {
    public PratoSimples(String nome) {
        super(nome);
    }

    public String preparar() {
        return "Preparando o prato " + getNome() + ": Cozinhar os ingredientes e servir.";
    }
}
