
public class ContaCorrente {

    private String agencia;
    private String numConta;
    private Double saldo;

    public ContaCorrente(String agencia, String numConta, Double saldo) {
        this.agencia = agencia;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNumConta() {
        return numConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "agencia='" + agencia + '\'' +
                ", numConta='" + numConta + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public static ContaCorrente deposita(ContaCorrente contaCorrente, Double valor){
        if (valor <= 0.00){
            System.out.println("Não foi possivel realizar o deposito, valor de deposito deve ser maior que 0");
            return null;
        }
        Double saldoAtualizado = contaCorrente.getSaldo() + valor;

        System.out.println("Deposito realizado com sucesso !");
        ContaCorrente cc = new ContaCorrente(contaCorrente.getAgencia(), contaCorrente.getNumConta(), saldoAtualizado);
        return cc;
    }
}
