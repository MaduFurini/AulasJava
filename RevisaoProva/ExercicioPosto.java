package RevisaoProva;

import java.util.Scanner;

public class ExercicioPosto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String comb;
        double qtdLitros, precoA = 3.15, precoG = 5.10, res;

        System.out.println("Digite o combustível abastecido: \n A - Álcool \n G - Gasolina");
        comb = scanner.nextLine();

        System.out.println("Digite a quantidade de litros");
        qtdLitros = scanner.nextFloat();

        if (comb.equals("A")) {
            if(qtdLitros > 20){
                res = (precoA * qtdLitros) - (precoA * qtdLitros * 0.05);
            }else{
                res = (precoA * qtdLitros) - (precoA * qtdLitros * 0.03);
            }
        }else{
            if (qtdLitros > 20) {
                res = (precoG * qtdLitros) - (precoG * qtdLitros * 0.06);
            }else{
                res = (precoG * qtdLitros) - (precoG * qtdLitros * 0.04);
            }
        }

        System.out.println("Total a ser pago " + res);
    }
}