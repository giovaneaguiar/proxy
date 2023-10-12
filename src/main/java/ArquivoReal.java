public class ArquivoReal implements Arquivo {
    private final String nomeArquivo;
    private String conteudo;

    public ArquivoReal(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        carregarArquivo();
    }

    private void carregarArquivo() {
        conteudo = "Conteúdo do arquivo: " + nomeArquivo;
    }

    public String lerConteudo() {
        return conteudo;
    }
}