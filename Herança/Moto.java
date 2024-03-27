package Herança;

public class Moto extends Veiculo{

    private int cilindrada;

    public Moto(String marca, String modelo, int ano, int cilindrada) {
        super(marca, modelo, ano);
        this.cilindrada = cilindrada;
    }
    
    public void setCilindrada(int cilindrada){
        this.cilindrada = cilindrada;
    }

    public int getCilindrada(){
        return this.cilindrada;
    }
}
