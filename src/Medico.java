public class Medico extends Funcionario{

    private String especialidade;
    private String crm;

    public Medico(String nome, Integer idade, Double salario, String especialidade, String crm) {
        super(nome, idade, salario);
        this.especialidade = especialidade;
        this.crm = crm;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", salario=" + salario +
                ", especialidade='" + especialidade + '\'' +
                ", crm='" + crm + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Funcionario medico = new Medico("Stephanie", 24, 10000.00, "Pediatra", "0001");
        Double decimoTerceiro = medico.calculaDecimoTerceiroSalario(10000.00);

        System.out.println("Medico : " + medico);
        System.out.println("Decimo terceiro salario do médico " + medico.nome + " será: " + decimoTerceiro);
    }
}