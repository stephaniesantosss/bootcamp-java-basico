public class Analista extends Funcionario implements AbonoSalarial{

    private String nivelCargo;
    private Double abono;

    public Analista(String nome, Integer idade, Double salario, String nivelCargo) {
        super(nome, idade, salario);
        this.nivelCargo = nivelCargo;
        this.abono = calculaAbonoSalario(salario);
    }

    @Override
    public String toString() {
        return "Analista{" +
                "nivelCargo='" + nivelCargo + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", salario=" + salario +
                '}';
    }

    public static void main(String[] args) {
        Analista analista = new Analista("Stephanie", 24, 10000.00, "Pleno");

        System.out.println("Analista : " + analista);
        System.out.println("O abono deste analista será: " + analista.abono);
    }

    @Override
    public Double calculaAbonoSalario(Double salario) {
        Double abono = salario + salario + salario * 0.20;
        return abono;
    }
}
