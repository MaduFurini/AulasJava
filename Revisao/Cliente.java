package Revisao;

public class Cliente {
    
    private String nome;
    private int idade;
    private String email;


    public void setNome(String name){
        this.nome = name;
    }

    public String getNome(){
        return this.nome;
    }

    public void setIdade(int age){
        this.idade = age;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setEmail(String mail){
        this.email = mail;
    }

    public String getEmail(){
        return this.email;
    }

    public Cliente(String nome, int idade, String email){
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public Cliente(){
        this.nome = "Maria";
        this.idade = 19;
        this.email = "madufurini@gmail.com";
    }


}
