package Main;
import Acessorios.Acessorios;
import Veiculos.Carro;
import Impostos.ImpostoImportado;
public class Main {
    public static void main(String[] args){
        var acessoriosCarro1 = new Acessorios(false, true, true, true, true, true, true);
        var carro = new Carro("Gol", "Volkswagem", 2010, 1.6, 30000, true, acessoriosCarro1);
        var acessoriosCarro2 = new Acessorios(true, true, true, false, true, true, false);
        var carro2 = new Carro("Etios", "Toyota", 2014, 1.3, 50000, true, acessoriosCarro2);

        System.out.printf("O valor base do carro escolhido é: R$%.2f\nApós a aplicação dos impostos IPI e Imposto de importação o valor total foi de: R$%.2f", carro.getValorBase(),
carro.calculaValorTotal(carro));
        System.out.println(acessoriosCarro1.toString());
        System.out.println();
        System.out.printf("O valor base do carro escolhido é: R$%.2f\nApós a aplicação dos impostos IPI e Imposto de importação o valor total foi de: R$%.2f", carro2.getValorBase(),
                carro2.calculaValorTotal(carro2));
        System.out.println(acessoriosCarro2.toString());
    }
}