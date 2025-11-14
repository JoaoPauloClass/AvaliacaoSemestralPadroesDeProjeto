class DadosCliente {
    private String nome;
    private int idade;
    private double patrimonioTotal;
    private double rendaMensal;
    private int experienciaInvestimentos;
    
    public DadosCliente(String nome, int idade, double patrimonioTotal, 
                       double rendaMensal, int experienciaInvestimentos) {
        this.nome = nome;
        this.idade = idade;
        this.patrimonioTotal = patrimonioTotal;
        this.rendaMensal = rendaMensal;
        this.experienciaInvestimentos = experienciaInvestimentos;
    }
    
    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public double getPatrimonioTotal() { return patrimonioTotal; }
    public double getRendaMensal() { return rendaMensal; }
    public int getExperienciaInvestimentos() { return experienciaInvestimentos; }
}