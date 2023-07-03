import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    public static void main(String[] args) {

        Livro livro1 = new Livro("Backend Java", "João Pedro", 2022);
        Livro livro2 = new Livro("Microsservices", "Maria", 2021);
        Livro livro3 = new Livro("Springboot", "Michelle", 2022);

        List<Livro> livros = new ArrayList<>();
        livros.add(livro1);
        livros.add(livro2);
        livros.add(livro3);

        var livrosPorAno = livrosPorAno(livros, 2022);
        System.out.println("Estes são os livros de acordo com o ano informado: " + livrosPorAno);
    }

    public static List<Livro> livrosPorAno(List<Livro> livros, int ano) {
        List<Livro> listaAtualizada = new ArrayList<>();

        for (Livro livro : livros) {
            if (livro.getAnoLancamento() == ano) {
                listaAtualizada.add(livro);
            }
        }
        return listaAtualizada;
    }
}
