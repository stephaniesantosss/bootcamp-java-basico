import java.io.File;
import java.io.IOException;

public class ArquivoService {

    public static void main(String[] args) {
        File arquivo = new File("C:/Users/steph/Desktop/Java/bootcamp-java-basico/src/arquivos/conteudo.txt");
        File diretorio = new File("C:/Users/steph/Desktop/Java/bootcamp-java-basico/src/arquivos");

        File nomeArquivoNovo = new File("C:/Users/steph/Desktop/Java/bootcamp-java-basico/src/arquivos/conteudo-extra.txt");

        criarArquivo(arquivo);
        listarArquivos(diretorio);

        boolean renomeado = arquivo.renameTo(nomeArquivoNovo);

        if (renomeado) {
            System.out.println("Arquivo renomeado com sucesso");
        } else {
            System.out.println("Falha ao renomear arquivo !");
        }
    }

    private static void listarArquivos(File diretorio) {
        if (diretorio.isDirectory()) {
            File[] arquivos = diretorio.listFiles();

            if (arquivos != null) {
                for (File arq : arquivos) {
                    System.out.println("O nome do arquivo é: " + arq.getName());
                }
            }
        } else {
            System.out.println("O caminho especificado não é um diretório :( ");
        }
    }

    private static void criarArquivo(File arquivo) {
        try {
            boolean arquivoCriado = arquivo.createNewFile();

            if (arquivoCriado) {
                System.out.println("Arquivo criado com sucesso !");
            } else {
                System.out.println("Falha ao criar arquivo ! :( ");
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ;( " + e.getMessage());
        }
    }
}
