public class Funcionario {

    private String nome;
    private Integer idade;
    private Double salario;

    public Funcionario(String nome, Integer idade, Double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public static Double calculaDecimoTerceiroSalario(Double salario){
        return salario + salario * 0.10;
    }

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Stephanie", 24, 2000.00);

        //System.out.println("Funcionario: " + funcionario);

        System.out.println("Funcionario: Nome= "
                + funcionario.nome + " Idade= "
                + funcionario.idade + " Salario= "
                + funcionario.salario);

        Double decimoTerceiro = calculaDecimoTerceiroSalario(funcionario.salario);

        System.out.println("O decimo terceiro salario do funcionario " + funcionario.nome + " será: " + decimoTerceiro);
    }
}
