package Q14.model;

public class ExportadorCSV implements ExportadorRelatorio {
    public String exportar(String titulo, String conteudo) {
        return "CSV gerado com sucesso: " + titulo;
    }
}
