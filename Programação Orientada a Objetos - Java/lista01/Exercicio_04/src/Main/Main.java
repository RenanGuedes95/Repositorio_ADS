package Main;
import FormaGeometrica.Retangulo;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        System.out.println("De quantos retângulos você precisa calcular a area e o perimetro ?");
        int quantidade = Integer.parseInt(leitura.nextLine());
        var listaRentagulos = new Retangulo[quantidade];

        for(int i = 0; i < listaRentagulos.length; i++){
            var retangulo = new Retangulo();
            System.out.println(String.format("Digite o valor do comprimento do retângulo nº%d", i+1));
            retangulo.setComprimento(Double.parseDouble(leitura.nextLine()));
            System.out.println(String.format("Digite o valor da largura do retângulo nº%d", i + 1));
            retangulo.setLargura(Double.parseDouble(leitura.nextLine()));
            listaRentagulos[i] = retangulo;
            System.out.println("A área do retângulo nº" + (i+1) + " é igual a: " + listaRentagulos[i].calculaArea(retangulo));
            System.out.println("O perimetro do retângulo nº" + (i+1) + " é igual a: " + listaRentagulos[i].calculaPerimetro(retangulo));
        }
    }
}
