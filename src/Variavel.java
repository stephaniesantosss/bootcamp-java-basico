import poo.Funcionario;
import poo.Medico;

import static java.lang.System.out;

public class Variavel {

    public static void main(String[] args) {
        String nomeEstudante = "Maria";
        int idade = 18;
        double salario = 1500.00;

    out.println("O nome do(a) estudante é: " + nomeEstudante + " e ele(a) tem " + idade + " anos" + " e recebe "
    + salario + " reais");

        byte tamanho = 127;
        short valorCurto = 32767;
        char caracter = 'A';
        float valorPontoFlutuante = 3.4028235E38f;
        double valorPontoFlutuanteMaior = 1.7976931348623157E308;
        int inteiro = 2147483647;
        long inteiroLongo = 9223372036854775807L;
        boolean veradedeiroFalso = true;

        out.println("Tamanho dos dados: \n" +
                "\nMinimo Byte: " + Byte.MIN_VALUE +
                "\nMaximo Byte: " + Byte.MAX_VALUE +
                "\nMinimo Short: " + Short.MIN_VALUE +
                "\nMaximo Short: " + Short.MAX_VALUE +
                "\nMinimo Int: " + Integer.MIN_VALUE +
                "\nMaximo Int: " + Integer.MAX_VALUE +
                "\nMinimo Long: " + Long.MIN_VALUE +
                "\nMaximo Long:" + Long.MAX_VALUE +
                "\nMinimo Float: " + Float.MIN_VALUE +
                "\nMaximo Float: " + Float.MAX_VALUE +
                "\nMinimo Double: " + Double.MIN_VALUE +
                "\nMaximo Double: " + Double.MAX_VALUE);

        Medico medico = new Medico("João", 19, 1000.00, "Clinico Geral", "123");

        out.println("O funcionário é: " + medico);
    }

}
