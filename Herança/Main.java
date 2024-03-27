package Herança;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro car = new Carro(null, null, 0, 0);
        Moto moto = new Moto(null, null, 0, 0);

        List<Carro> carros = new ArrayList<>();
        List<Moto> motos = new ArrayList<>();

        do{
            System.out.println("Qual veículo você deseja cadastrar. \n 1 - Carro \n 2 - Moto \n 3 - Visualizar veículos cadastrados \n 4 - Sair");
            int acao = scanner.nextInt();

            switch (acao) {
                case 1:
                    System.out.println("Insira a marca do carro: ");
                    car.setMarca(scanner.nextLine());
                    car.setMarca(scanner.nextLine());

                    System.out.println("Insira o modelo do carro: ");
                    car.setModelo(scanner.nextLine());

                    System.out.println("Insira o ano do carro: ");
                    car.setAno(scanner.nextInt());

                    System.out.println("Insira o número de portas do carro: ");
                    car.setNumPortas(scanner.nextInt());

                    carros.add(car);
                    
                    System.out.println("Carro cadastrado com sucesso! \n Marca: " + car.getMarca() + "\n Modelo: " + car.getModelo() + "\n Ano: " + car.getAno() + "\n Número de portas: " + car.getNumPortas());
                    break;

                case 2:
                    System.out.println("Insira a marca da moto: ");
                    moto.setMarca(scanner.nextLine());
                    moto.setMarca(scanner.nextLine());

                    System.out.println("Insira o modelo da moto: ");
                    moto.setModelo(scanner.nextLine());

                    System.out.println("Insira o ano da moto: ");
                    moto.setAno(scanner.nextInt());

                    System.out.println("Insira o número de cilindradas da moto: ");
                    moto.setCilindrada(scanner.nextInt());

                    motos.add(moto);

                    System.out.println("Moto cadastrada com sucesso! \n Marca: " + moto.getMarca() + "\n Modelo: " + moto.getModelo() + "\n Ano: " + moto.getAno() + "\n Número de cilindradas: " + moto.getCilindrada());
                    break;
            
                case 3:
                    if (carros.isEmpty()) {
                        System.out.println("Nenhum carro cadastrado.");
                    } else {
                        System.out.println("Carros cadastrados:");
                        for (Carro carro : carros) {
                            System.out.println("Marca: " + carro.getMarca());
                            System.out.println("Modelo: " + carro.getModelo());
                            System.out.println("Ano: " + carro.getAno());
                            System.out.println("Número de portas: " + carro.getNumPortas());
                            System.out.println("------------------------");
                        }
                    }

                    System.out.println("=============================");

                    if (motos.isEmpty()) {
                        System.out.println("Nenhum carro cadastrado.");
                    } else {
                        System.out.println("Carros cadastrados:");
                        for (Moto motor : motos) {
                            System.out.println("Marca: " + motor.getMarca());
                            System.out.println("Modelo: " + motor.getModelo());
                            System.out.println("Ano: " + motor.getAno());
                            System.out.println("Número de cilindradas: " + motor.getCilindrada());
                            System.out.println("------------------------");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Encerrando...");
                    System.exit(1);
                    break;
                default:
                    break;
            }
        }while (true);
    }
}
