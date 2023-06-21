
public class ContaCorrenteMain {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("123", "1234", 10.00);

        ContaCorrente conta = ContaCorrente.deposita(cc, 1000.00);
        System.out.println("Deposito realizado com sucesso " + conta);
    }
}
