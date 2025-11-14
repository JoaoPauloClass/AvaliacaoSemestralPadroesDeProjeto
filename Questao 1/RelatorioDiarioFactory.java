class FabricaRelatorioDiario extends RelatorioFactory {
    
    @Override
    public Relatorio criarRelatorio() {
        System.out.println("Fábrica: Criando relatório diário...");
        return new RelatorioDiarioConcreto();
    }
}