package RevisaoProva;

import java.util.Scanner;

public class Estruturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cont = 0;

        //Estrutura
        while(cont < 5){
            System.out.println("Contador " + cont);
            cont++;
        }

        int idade = 18;

        if(idade < 18){
            System.out.println("Menor de idade");
        }else if(idade >= 18 && idade < 65){
            System.out.println("Adulto");
        }else{
            System.out.println("Idoso");
        }
    }   
}
