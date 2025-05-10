package Q10;

import Q10.model.*;
import Q10.service.GestorProjeto;

public class Main {
    public static void main(String[] args) {
        GestorProjeto gestor = new GestorProjeto();

        MembroEquipe dev = new Desenvolvedor("Lucas", "Sistema A");
        MembroEquipe designer = new Designer("Ana", "Sistema A");
        MembroEquipe gerente = new GerenteDeProjetos("Carlos", "Sistema B");

        gestor.adicionarMembro(dev);
        gestor.adicionarMembro(designer);
        gestor.adicionarMembro(gerente);

        System.out.println(gestor.exibirRelatorio(dev));
        System.out.println(gestor.exibirRelatorio(designer));
        System.out.println(gestor.exibirRelatorio(gerente));

        System.out.println("\nEquipe do projeto 'Sistema A':");
        for (MembroEquipe m : gestor.listarEquipePorProjeto("Sistema A")) {
            System.out.println(m.obterDetalhes());
        }
    }
}

