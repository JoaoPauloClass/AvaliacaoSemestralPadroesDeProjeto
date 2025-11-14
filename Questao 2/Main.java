class Main {
    public static void main(String[] args) {

        DadosCliente cliente = new DadosCliente(
            "João Silva",
            35,           
            500000.0,    
            15000.0,
            8         
        );
        
        System.out.println("╔════════════════════════════════════════════╗");
        System.out.println("║  PLATAFORMA DE ANÁLISE DE INVESTIMENTOS   ║");
        System.out.println("╚════════════════════════════════════════════╝");
        
        // Analisa modelo AGRESSIVO
        AnalisadorInvestimentos analisador = new AnalisadorInvestimentos(new ModeloAgressivo());
        ResultadoAnalise resultado1 = analisador.analisarCliente(cliente);
        System.out.println(resultado1);
        
        System.out.println("─".repeat(50));
        
        // Troca para modelo MODERADO
        analisador.setEstrategia(new ModeloModerado());
        ResultadoAnalise resultado2 = analisador.analisarCliente(cliente);
        System.out.println(resultado2);
        
        System.out.println("─".repeat(50));
        
        // Troca para modelo CONSERVADOR
        analisador.setEstrategia(new ModeloConservador());
        ResultadoAnalise resultado3 = analisador.analisarCliente(cliente);
        System.out.println(resultado3);
        
        System.out.println("─".repeat(50));
        
        // Simula cliente diferente com modelo agressivo
        DadosCliente cliente2 = new DadosCliente(
            "Maria Santos",
            28,
            200000.0,
            10000.0,
            3
        );
        
        analisador.setEstrategia(new ModeloAgressivo());
        ResultadoAnalise resultado4 = analisador.analisarCliente(cliente2);
        System.out.println(resultado4);
    }
}