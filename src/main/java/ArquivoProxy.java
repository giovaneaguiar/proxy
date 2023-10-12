class ArquivoProxy implements Arquivo {
    private final String nomeArquivo;
    private ArquivoReal arquivoReal;

    public ArquivoProxy(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public String lerConteudo() {
        if (arquivoReal == null) {
            arquivoReal = new ArquivoReal(nomeArquivo);
        }
        return arquivoReal.lerConteudo();
    }
}
