package Impostos;
import Veiculos.Carro;

public abstract class ImpostoImportado {
    public static double calculaImpostoImportado(Carro carro){
        return (carro.isEhImportado()) ? carro.getValorBase() * 0.3: 0;
    }
}
