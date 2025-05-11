package Q17.service;

import Q17.model.Material;
import Q17.model.Usuario;
import Q17.exception.EmprestimoException;

public class EmprestimoService {

    public boolean realizarEmprestimo(Usuario usuario, Material material) {
        try {
            if (usuario == null || material == null) {
                throw new EmprestimoException("Usuário ou material inválido.");
            }
            usuario.adicionarMaterial(material);
            return true;
        } catch (EmprestimoException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean devolverMaterial(Usuario usuario, Material material) {
        try {
            if (usuario == null || material == null) {
                throw new EmprestimoException("Usuário ou material inválido.");
            }
            if (usuario.devolverMaterial(material)) {
                return true;
            } else {
                throw new EmprestimoException("Material não encontrado nos materiais emprestados.");
            }
        } catch (EmprestimoException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
