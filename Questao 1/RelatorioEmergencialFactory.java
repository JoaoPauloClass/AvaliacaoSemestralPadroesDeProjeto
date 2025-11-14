class FabricaRelatorioEmergencial extends RelatorioFactory {
    
    @Override
    public Relatorio criarRelatorio() {
        System.out.println("🚨 Fábrica: Criando relatório emergencial...");
        return new RelatorioEmergencialConcreto();
    }
}