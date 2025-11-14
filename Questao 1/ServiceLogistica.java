class ServiceLogistica {
    
    public void gerarRelatorio(RelatorioFactory fabrica) {
        System.out.println("\nIniciando processo de relatório...");
        fabrica.processarRelatorio();
        System.out.println("--- Processamento concluído ---\n");
    }
    
}