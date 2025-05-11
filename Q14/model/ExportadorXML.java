package Q14.model;

public class ExportadorXML implements ExportadorRelatorio {
    public String exportar(String titulo, String conteudo) {
        return "XML gerado com sucesso: " + titulo;
    }
}
