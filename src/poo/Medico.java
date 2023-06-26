package poo;

public class Medico extends Funcionario implements AbonoSalarial {

    private String especialidade;
    private String crm;
    private Double abono;

    public Medico(String nome, Integer idade, Double salario, String especialidade, String crm) {
        super(nome, idade, salario);
        this.especialidade = especialidade;
        this.crm = crm;
        this.abono = calculaAbonoSalario(salario);
    }

    @Override
    public String toString() {
        return "poo.Medico{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", salario=" + salario +
                ", especialidade='" + especialidade + '\'' +
                ", crm='" + crm + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Medico medico = new Medico("Stephanie", 24, 10000.00, "Pediatra", "0001");
        Double decimoTerceiro = medico.calculaDecimoTerceiroSalario(10000.00);

        System.out.println("poo.Medico : " + medico);
        System.out.println("Decimo terceiro salario do médico " + medico.nome + " será: " + decimoTerceiro);

        System.out.println("Abono deste médico será: " + medico.abono);
    }

    @Override
    public Double calculaAbonoSalario(Double salario) {
        Double abono = salario + salario + salario * 0.50;
        return abono;
    }
}
