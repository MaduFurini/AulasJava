package Exercicios.Funcionario;

public class Gerente extends Funcionario{

    double gratificacao;

    public Gerente(int cpf, String nome, int idade, double horaTrabalhada, double valorHora, double gratificacao){
        super(cpf, nome, idade, horaTrabalhada, valorHora);
        this.gratificacao = gratificacao;
    }

    public void setGratificacao(double gratificacao){
        this.gratificacao = gratificacao;
    }

    @Override 
    public void calcularSalario(){
        double salario = this.horaTrabalhada *  this.valorHora + (this.horaTrabalhada *  this.valorHora * (this.gratificacao / 100));

        System.out.println("O salário do funcionário " + this.nome + " é: " + salario);
    }

    @Override
    public void apresentar()
    {
        System.out.println("Dados do gerente");
        System.out.println("CPF: " + this.cpf);
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Gratificação: " + this.gratificacao);
        System.out.println("Horas trabalhadas: " + this.horaTrabalhada);
        System.out.println("Valor ganho por hora: " + this.valorHora);
    }
}
