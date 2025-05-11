package Q14.model;

public class ExportadorPDF implements ExportadorRelatorio {
    public String exportar(String titulo, String conteudo) {
        return "PDF gerado com sucesso: " + titulo;
    }
}