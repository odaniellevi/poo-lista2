package Q14;

import Q14.model.*;
import Q14.service.SistemaRelatorios;

public class Main {
    public static void main(String[] args) {
        SistemaRelatorios sistema = new SistemaRelatorios();

        ExportadorRelatorio pdf = new ExportadorPDF();
        ExportadorRelatorio csv = new ExportadorCSV();
        ExportadorRelatorio xml = new ExportadorXML();

        System.out.println(sistema.exportarRelatorio(pdf, "Relatório Financeiro", "Dados financeiros do trimestre"));
        System.out.println(sistema.exportarRelatorio(csv, "Relatório de Clientes", "Lista de clientes ativos"));
        System.out.println(sistema.exportarRelatorio(xml, "Relatório de Produtos", "Estoque atualizado"));

        try {
            sistema.exportarRelatorio(null, "Falha", "Erro simulado");
        } catch (RuntimeException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

