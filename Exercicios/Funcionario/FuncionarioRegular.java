package Exercicios.Funcionario;

public class FuncionarioRegular extends Funcionario{

    String nomeSupervisor;

    public FuncionarioRegular(int cpf, String nome, int idade, double horaTrabalhada, double valorHora, String nomeSupervisor){
        super(cpf, nomeSupervisor, idade, horaTrabalhada, valorHora);
        this.nomeSupervisor = nomeSupervisor;
    }

    public void setNomeSupervisor(String nomeSupervisor){
        this.nomeSupervisor = nomeSupervisor;
    }

    @Override 
    public void apresentar(){
        System.out.println("Dados do funcionário");
        System.out.println("CPF: " + this.cpf);
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Nome do supervisor: " + this.nome);
        System.out.println("Horas trabalhadas: " + this.horaTrabalhada);
        System.out.println("Valor ganho por hora: " + this.valorHora);
    }
}