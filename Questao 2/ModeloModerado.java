class ModeloModerado implements EstrategiaCalculoRisco {
    
    @Override
    public ResultadoAnalise calcularPerfil(DadosCliente cliente) {
        System.out.println("-> Aplicando modelo MODERADO...");
        
        double pontuacao = 0;
        
        pontuacao += cliente.getExperienciaInvestimentos() * 5.0;
        pontuacao += (cliente.getPatrimonioTotal() / 100000) * 2.5;
        pontuacao += (100 - cliente.getIdade()) * 0.25;
        pontuacao += (cliente.getRendaMensal() / 10000) * 2.5;
        
        String classificacao;
        String recomendacao;
        
        if (pontuacao >= 60) {
            classificacao = "MODERADO DINÂMICO";
            recomendacao = "50% ações, 30% fundos, 20% renda fixa";
        } else if (pontuacao >= 40) {
            classificacao = "MODERADO EQUILIBRADO";
            recomendacao = "40% ações, 30% fundos, 30% renda fixa";
        } else {
            classificacao = "MODERADO CONSERVADOR";
            recomendacao = "30% ações, 30% fundos, 40% renda fixa";
        }
        
        return new ResultadoAnalise("MODERADO", pontuacao, classificacao, recomendacao);
    }
}