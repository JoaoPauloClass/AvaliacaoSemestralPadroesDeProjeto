class RelatorioEmergencialConcreto extends Relatorio {
    
    @Override
    public void prepararDados() {
        this.titulo = "RELATÓRIO EMERGENCIAL - AÇÃO IMEDIATA";
        this.fonte = "Sistema de monitoramento em tempo real";
        System.out.println("-> Coletando dados críticos...");
        System.out.println("  X ALERTA: 3 veículos atrasados");
        System.out.println("  X Rota bloqueada: BR-101");
        System.out.println("  x Cliente prioritário aguardando");
    }
    
    @Override
    public void aplicarFormatacao() {
        this.formato = "E-mail + SMS (alta prioridade)";
        System.out.println("-> Aplicando formatação emergencial (alertas destacados)");
    }
}
