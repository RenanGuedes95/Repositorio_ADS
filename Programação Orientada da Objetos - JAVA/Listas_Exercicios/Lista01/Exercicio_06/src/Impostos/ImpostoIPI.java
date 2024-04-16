package Impostos;
import Veiculos.Carro;

public class ImpostoIPI {
    public static double calculaImpostoIPI(Carro carro){
        return (carro.getPotenciaDoMotor() == 1.0) ? carro.getValorBase() * 0.1 : carro.getValorBase() * 0.2;
    }
}
