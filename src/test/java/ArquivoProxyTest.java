import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArquivoProxyTest {
    @Test
    public void testLerConteudoDoArquivoProxy() {
        Arquivo arquivo = new ArquivoProxy("documento.txt");

        String conteudo1 = arquivo.lerConteudo();
        String conteudo2 = arquivo.lerConteudo();

        assertEquals("Conteúdo do arquivo: documento.txt", conteudo1);
        assertEquals("Conteúdo do arquivo: documento.txt", conteudo2);
    }

    @Test
    public void testArquivoProxyComDiferentesArquivos() {
        Arquivo arquivo1 = new ArquivoProxy("arquivo1.txt");
        Arquivo arquivo2 = new ArquivoProxy("arquivo2.txt");

        String conteudoArquivo1 = arquivo1.lerConteudo();
        String conteudoArquivo2 = arquivo2.lerConteudo();

        assertEquals("Conteúdo do arquivo: arquivo1.txt", conteudoArquivo1);
        assertEquals("Conteúdo do arquivo: arquivo2.txt", conteudoArquivo2);
    }
}
