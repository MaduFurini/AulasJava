package RevisaoProva;

public class Calculadora {
    double num1;
    double num2;
    double resultado;

    public double soma(double num1, double num2){
        return num1 + num2;
    }

    public double subtrair(double num1, double num2){
        return num1 - num2;
    }

    public double dividir(double num1, double num2){
        if(num2 == 0){
            System.out.println("Operação inválida");
        
            return 0;
        }  
         
        return num1 / num2;
    }

    public double multiplicar(double num1, double num2){
        return num1 * num2;
    }

}
