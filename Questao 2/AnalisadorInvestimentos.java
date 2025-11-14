class AnalisadorInvestimentos {
    private EstrategiaCalculoRisco estrategia;
    
    public AnalisadorInvestimentos(EstrategiaCalculoRisco estrategia) {
        this.estrategia = estrategia;
    }
    
    // Permite trocar estratégia em tempo de execução
    public void setEstrategia(EstrategiaCalculoRisco estrategia) {
        this.estrategia = estrategia;
        System.out.println("\n Estratégia alterada para: " + 
                         estrategia.getClass().getSimpleName());
    }
    
    public ResultadoAnalise analisarCliente(DadosCliente cliente) {
        System.out.println("\n=== ANÁLISE DE PERFIL ===");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade() + " anos");
        System.out.println("Patrimônio: R$ " + String.format("%.2f", cliente.getPatrimonioTotal()));
        System.out.println("Renda Mensal: R$ " + String.format("%.2f", cliente.getRendaMensal()));
        System.out.println("Experiência: " + cliente.getExperienciaInvestimentos() + " anos");
        
        return estrategia.calcularPerfil(cliente);
    }
}
