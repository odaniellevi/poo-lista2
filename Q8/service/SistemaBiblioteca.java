package Q8.service;

import Q8.model.MaterialBiblioteca;
import Q8.exception.BibliotecaException;

public class SistemaBiblioteca {
    public String registrarEmprestimo(MaterialBiblioteca material) {
        return "Título: " + material.getTitulo() + " | Prazo de Devolução: " + material.getPrazoDevolucao() + " dias";
    }

    public double calcularMulta(MaterialBiblioteca material, int diasAtraso) {
        if (diasAtraso < 0) {
            throw new BibliotecaException("Dias de atraso inválidos");
        }
        return material.calcularMulta(diasAtraso);
    }
}