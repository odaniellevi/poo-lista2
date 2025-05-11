package Q16.model;

import java.util.ArrayList;

public class Prato {
    private String nome;
    private ArrayList<Ingrediente> ingredientes = new ArrayList<>();

    public Prato(String nome) {
        this.nome = nome;
    }

    public void adicionarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

    public String listarIngredientes() {
        StringBuilder sb = new StringBuilder();
        for (Ingrediente ingrediente : ingredientes) {
            sb.append(ingrediente.informar()).append("\n");
        }
        return sb.toString();
    }

    public String getNome() {
        return nome;
    }
}