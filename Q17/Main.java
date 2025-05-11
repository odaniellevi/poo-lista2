package Q17;

import Q17.model.*;
import Q17.service.EmprestimoService;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("João");

        Livro livro = new Livro("Java para Iniciantes");
        Revista revista = new Revista("Revista Tech");
        DVD dvd = new DVD("Filme Aventura");

        EmprestimoService emprestimoService = new EmprestimoService();

        // Realizando empréstimos
        emprestimoService.realizarEmprestimo(usuario, livro);
        emprestimoService.realizarEmprestimo(usuario, revista);
        emprestimoService.realizarEmprestimo(usuario, dvd);

        // Listando materiais emprestados
        System.out.println(usuario.listarMateriaisEmprestados());

        // Realizando devoluções
        emprestimoService.devolverMaterial(usuario, livro);
        emprestimoService.devolverMaterial(usuario, revista);

        // Listando materiais após devolução
        System.out.println(usuario.listarMateriaisEmprestados());
    }
}

