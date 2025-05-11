package Q14.service;

import Q14.model.ExportadorRelatorio;
import Q14.exception.ErroDeExportacaoException;

public class SistemaRelatorios {
    public String exportarRelatorio(ExportadorRelatorio exportador, String titulo, String conteudo) {
        if (exportador == null || titulo == null || conteudo == null) {
            throw new ErroDeExportacaoException("Exportador, título e conteúdo não podem ser nulos.");
        }
        return exportador.exportar(titulo, conteudo);
    }
}