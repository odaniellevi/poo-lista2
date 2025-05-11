package Q16.service;

import Q16.exception.RestauranteException;
import Q16.model.Ingrediente;
import Q16.model.Prato;
import Q16.model.Preparo;

public class RestauranteService {

    // Adicionar ingrediente ao prato com validação de entrada
    public void adicionarIngredienteAoPrato(Prato prato, Ingrediente ingrediente) {
        if (prato == null) {
            throw new RestauranteException("Erro: O prato não pode ser nulo.");
        }
        if (ingrediente == null) {
            throw new RestauranteException("Erro: Ingrediente inválido ou nulo.");
        }
        prato.adicionarIngrediente(ingrediente);
    }

    // Preparar o prato com verificação de preparo nulo
    public String prepararPrato(Preparo preparo) {
        if (preparo == null) {
            throw new RestauranteException("Erro: O preparo não pode ser nulo.");
        }
        return preparo.preparar();
    }

    // Exibir os ingredientes do prato com tratamento ao receber prato nulo
    public String exibirIngredientes(Prato prato) {
        if (prato == null) {
            throw new RestauranteException("Erro: O prato especificado é inválido.");
        }
        return prato.listarIngredientes();
    }
}