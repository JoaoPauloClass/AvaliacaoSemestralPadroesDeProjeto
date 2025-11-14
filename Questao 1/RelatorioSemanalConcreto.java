class RelatorioSemanalConcreto extends Relatorio {
    
    @Override
    public void prepararDados() {
        this.titulo = "Relatório Operacional Semanal";
        this.fonte = "Data Warehouse (últimos 7 dias)";
        System.out.println("-> Coletando dados semanais...");
        System.out.println("  - Total de entregas: 1.050");
        System.out.println("  - Média diária: 150");
        System.out.println("  - Tendência: +5% vs semana anterior");
        System.out.println("  - Rotas otimizadas: 12");
    }
    
    @Override
    public void aplicarFormatacao() {
        this.formato = "PDF detalhado com gráficos";
        System.out.println("-> Aplicando formatação semanal (análise completa + gráficos)");
    }
}