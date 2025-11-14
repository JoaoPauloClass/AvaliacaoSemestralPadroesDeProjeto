class RelatorioDiarioConcreto extends Relatorio {
    
    @Override
    public void prepararDados() {
        this.titulo = "Relatório Operacional Diário";
        this.fonte = "Banco de dados transacional (últimas 24h)";
        System.out.println("→ Coletando dados do dia atual...");
        System.out.println("  - Entregas realizadas: 150");
        System.out.println("  - Veículos em operação: 25");
        System.out.println("  - Taxa de sucesso: 98%");
    }
    
    @Override
    public void aplicarFormatacao() {
        this.formato = "PDF compacto";
        System.out.println("→ Aplicando formatação diária (métricas resumidas)");
    }
}