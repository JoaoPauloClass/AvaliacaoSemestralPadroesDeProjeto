class ModeloAgressivo implements EstrategiaCalculoRisco {
    
    @Override
    public ResultadoAnalise calcularPerfil(DadosCliente cliente) {
        System.out.println("-> Aplicando modelo AGRESSIVO...");
        
        double pontuacao = 0;
        
        pontuacao += cliente.getExperienciaInvestimentos() * 8.0;
        
        pontuacao += (cliente.getPatrimonioTotal() / 100000) * 3.0;
        
        pontuacao += (100 - cliente.getIdade()) * 0.2;
        
        pontuacao += (cliente.getRendaMensal() / 10000) * 1.0;
        
        String classificacao;
        String recomendacao;
        
        if (pontuacao >= 70) {
            classificacao = "ULTRA AGRESSIVO";
            recomendacao = "80% ações, 15% fundos multimercado, 5% renda fixa";
        } else if (pontuacao >= 50) {
            classificacao = "AGRESSIVO";
            recomendacao = "70% ações, 20% fundos, 10% renda fixa";
        } else {
            classificacao = "MODERADAMENTE AGRESSIVO";
            recomendacao = "60% ações, 25% fundos, 15% renda fixa";
        }
        
        return new ResultadoAnalise("AGRESSIVO", pontuacao, classificacao, recomendacao);
    }
}