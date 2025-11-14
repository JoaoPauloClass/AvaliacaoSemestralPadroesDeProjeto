class FabricaRelatorioSemanal extends RelatorioFactory {
    
    @Override
    public Relatorio criarRelatorio() {
        System.out.println("Fábrica: Criando relatório semanal...");
        return new RelatorioSemanalConcreto();
    }
}