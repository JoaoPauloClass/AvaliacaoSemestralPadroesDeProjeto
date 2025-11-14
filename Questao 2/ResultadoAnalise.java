class ResultadoAnalise {
    private String modelo;
    private double pontuacaoRisco;
    private String classificacao;
    private String recomendacao;
    
    public ResultadoAnalise(String modelo, double pontuacaoRisco, 
                           String classificacao, String recomendacao) {
        this.modelo = modelo;
        this.pontuacaoRisco = pontuacaoRisco;
        this.classificacao = classificacao;
        this.recomendacao = recomendacao;
    }
    
    @Override
    public String toString() {
        return String.format(
            "\n=== RESULTADO DA ANÁLISE ===\n" +
            "Modelo: %s\n" +
            "Pontuação de Risco: %.2f\n" +
            "Classificação: %s\n" +
            "Recomendação: %s\n",
            modelo, pontuacaoRisco, classificacao, recomendacao
        );
    }
}
