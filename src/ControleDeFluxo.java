import java.util.Scanner;

public class ControleDeFluxo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é a sua idade ?");
        Integer idade = Integer.parseInt(sc.nextLine());

        if (idade < 18) {
            System.out.println("Acesso negado, você é menor de idade !");
        } else {
            System.out.println("Acesso liberado, você é maior de idade!");
        }

        System.out.println("Qual dia da semana você estuda ? (ex: 1,2,3...)");
        Integer diaSemana = Integer.parseInt(sc.nextLine());

        switch (diaSemana) {
            case 1:
                System.out.println("Você estuda todo domingo!");
                break;
            case 2:
                System.out.println("Você estuda toda segunda!");
                break;
            case 3:
                System.out.println("Você estuda toda terça");
                break;
            default:
                System.out.println("Opção inválida!");
        }

        for (var contador = 1; contador < 8; contador++) {
            System.out.println("O contador vale: " + contador);
        }

        var valor = 0;
        while (valor < 10) {
            System.out.println("O valor ainda não é >= 10 o valor é: " + valor);
            valor++;
        }
    }
}
