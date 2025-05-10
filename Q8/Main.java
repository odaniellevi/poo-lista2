package Q8;

import Q8.model.*;
import Q8.service.SistemaBiblioteca;

public class Main {
    public static void main(String[] args) {
        SistemaBiblioteca sistema = new SistemaBiblioteca();

        MaterialBiblioteca livro = new Livro("Dom Casmurro", 14);
        MaterialBiblioteca revista = new Revista("National Geographic", 7);
        MaterialBiblioteca dvd = new DVD("Interestelar", 3);

        System.out.println(sistema.registrarEmprestimo(livro));
        System.out.println(sistema.calcularMulta(livro, 3));

        System.out.println(sistema.registrarEmprestimo(revista));
        System.out.println(sistema.calcularMulta(revista, 2));

        System.out.println(sistema.registrarEmprestimo(dvd));
        System.out.println(sistema.calcularMulta(dvd, 10));
    }
}
