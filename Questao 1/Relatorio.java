abstract class Relatorio {
    protected String titulo;
    protected String fonte;
    protected String formato;
    
    public abstract void prepararDados();
    public abstract void aplicarFormatacao();
    
    public void gerar() {
        System.out.println("\n=== GERANDO RELATÓRIO ===");
        prepararDados();
        aplicarFormatacao();
        System.out.println("Título: " + titulo);
        System.out.println("Fonte: " + fonte);
        System.out.println("Formato: " + formato);
        System.out.println("Relatório gerado com sucesso!\n");
    }
}