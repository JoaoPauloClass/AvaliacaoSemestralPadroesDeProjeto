class ModeloConservador implements EstrategiaCalculoRisco {
    
    @Override
    public ResultadoAnalise calcularPerfil(DadosCliente cliente) {
        System.out.println("-> Aplicando modelo CONSERVADOR...");
        
        double pontuacao = 0;
        
        pontuacao += cliente.getIdade() * 0.4;
        
        pontuacao += (cliente.getRendaMensal() / 10000) * 3.5;
        
        pontuacao += (cliente.getPatrimonioTotal() / 100000) * 1.5;
        
        pontuacao += cliente.getExperienciaInvestimentos() * 1.0;
        
        String classificacao;
        String recomendacao;
        
        if (pontuacao >= 60) {
            classificacao = "ULTRA CONSERVADOR";
            recomendacao = "10% ações, 15% fundos, 75% renda fixa";
        } else if (pontuacao >= 40) {
            classificacao = "CONSERVADOR";
            recomendacao = "20% ações, 20% fundos, 60% renda fixa";
        } else {
            classificacao = "LEVEMENTE CONSERVADOR";
            recomendacao = "30% ações, 25% fundos, 45% renda fixa";
        }
        
        return new ResultadoAnalise("CONSERVADOR", pontuacao, classificacao, recomendacao);
    }
}