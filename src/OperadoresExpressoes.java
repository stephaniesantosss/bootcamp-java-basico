public class OperadoresExpressoes {
    public static void main(String[] args) {
        //Operadores Aritméticos

        int a = 5;
        int b = 3;

        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = a / b;
        int restoDivisao = a % b;

        System.out.println("A soma de a + b é: " + soma);
        System.out.println("A subtracao de a - b é: " + subtracao);
        System.out.println("A multiplicacao de a * b é: " + multiplicacao);
        System.out.println("A divisao de a / b é: " + divisao);
        System.out.println("O resto da divisao de a % b é: " + restoDivisao);

        //Operadores de Atribuicao
        a += 5; // a = a + 5;
        System.out.println("A += 5 é: " + a);

        a -= 5; // a = a - 5;
        System.out.println("A -= 5 é: " + a);

        a *= 2; // a = a * 2;
        System.out.println("A *= 2 é: " + a);

        a /= 4; // a = a / 4;
        System.out.println("A /= 4 é: " + a);

        a = 7;
        a %= 2;
        System.out.println("A vale 7 e a %= 2 é: " + a);

        //Operadores de comparação
        int c = 5;
        int d = 3;

        boolean ehIgual = c == d;
        boolean naoEhIgual = c != d;
        boolean maiorQue = c > d;
        boolean menorQue = c < d;
        boolean maiorOuIgual = c >= d;
        boolean menorOuIgual = c <= d;

        System.out.println("C é igual a D ? " + ehIgual);
        System.out.println("C não é igual a D ? " + naoEhIgual);
        System.out.println("C é maior que D ? " + maiorQue);
        System.out.println("C é menor que D ? " + menorQue);
        System.out.println("C é maior ou igual a D ? " + maiorOuIgual);
        System.out.println("C é menor ou igual a D ? " + menorOuIgual);

        //Operadores Lógicos
        boolean verdadeiro = true;
        boolean falso = false;

        boolean e = verdadeiro && falso;
        boolean ou = verdadeiro || falso;
        boolean nao = !verdadeiro;

        System.out.println("Verdadeiro && Falso é: " + e);
        System.out.println("Verdadeiro || Falso é: " + ou);
        System.out.println("!Verdadeiro é: " + nao);

        //Operadores de incremento e decremento
        int valor = 1;

        valor++;
        System.out.println("1 + 1 é: " + valor);
        valor--;
        System.out.println("2 - 1 é: " + valor);

        //Operador ternario

        int x = 2;
        int y = 3;

        int resultado = x < y ? x : y;

        System.out.println("O valor é: " + resultado);
    }
}
