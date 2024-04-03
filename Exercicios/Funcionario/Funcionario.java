package Exercicios.Funcionario;

public class Funcionario {
    
    int cpf;
    String nome;
    int idade;
    double horaTrabalhada;
    double valorHora;

    public Funcionario(int cpf, String nome, int idade, double horaTrabalhada, double valorHora){
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.horaTrabalhada = horaTrabalhada;
        this.valorHora = valorHora;
    }

    public void setCpf(int cpf){
        this.cpf = cpf;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setHoraTrabalhada(double horaTrabalhada){
        this.horaTrabalhada = horaTrabalhada;
    }

    public void setValorHora(double valorHora){
        this.valorHora = valorHora;
    }


    public void calcularSalario(){
        double salario =  this.horaTrabalhada * this.valorHora;

        System.out.println("O salário do funcionário " + this.nome + " é: " + salario);
    }

    public void apresentar(){
        System.out.println("Dados do funcionário");
        System.out.println("CPF: " + this.cpf);
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Horas trabalhadas: " + this.horaTrabalhada);
        System.out.println("Valor ganho por hora: " + this.valorHora);
    } 
}
