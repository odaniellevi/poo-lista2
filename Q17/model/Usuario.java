package Q17.model;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private ArrayList<Material> materiaisEmprestados;

    public Usuario(String nome) {
        this.nome = nome;
        this.materiaisEmprestados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarMaterial(Material material) {
        materiaisEmprestados.add(material);
    }

    public String listarMateriaisEmprestados() {
        StringBuilder lista = new StringBuilder("Materiais emprestados para " + nome + ":\n");
        for (Material material : materiaisEmprestados) {
            lista.append(material.informarMaterial()).append("\n");
        }
        return lista.toString();
    }

    public boolean devolverMaterial(Material material) {
        if (materiaisEmprestados.contains(material)) {
            materiaisEmprestados.remove(material);
            return true;
        }
        return false;
    }
}
