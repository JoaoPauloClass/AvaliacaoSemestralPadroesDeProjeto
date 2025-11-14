class Main {
    public static void main(String[] args) {
        ServiceLogistica sistema = new ServiceLogistica();
            
        System.out.println("\n Gerar relatório Diario:");
        sistema.gerarRelatorio(new FabricaRelatorioDiario());
        System.out.println("\n Gerar relatório Semanal:");
        sistema.gerarRelatorio(new FabricaRelatorioSemanal());
        System.out.println("\n Gerar relatório Emergencial:");
        sistema.gerarRelatorio(new FabricaRelatorioEmergencial());
}
}