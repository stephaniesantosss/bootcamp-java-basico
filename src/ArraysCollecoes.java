import java.util.ArrayList;

public class ArraysCollecoes {

    public static void main(String[] args) {
        int[] numeros = new int[5];

        numeros[0] = 15;
        numeros[1] = 2;
        numeros[2] = 18;
        numeros[3] = 25;
        numeros[4] = 200;

        System.out.println(numeros[3]);

        ArrayList<String> listNomes = new ArrayList<>();

        listNomes.add("Stephanie");
        listNomes.add("Jhony");
        listNomes.add("Maria");
        listNomes.add("João");

        System.out.println("Os nomes são estes: " + listNomes);

        listNomes.remove("Stephanie");

        System.out.println("Nomes atualizados: " + listNomes);

        System.out.println("O tamanho da lista é: " + listNomes.size());
    }
}
