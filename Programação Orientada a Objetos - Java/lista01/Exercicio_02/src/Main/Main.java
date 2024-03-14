package Main;
import Valores.Valores;
import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        var ponto = new Valores();
        var leitura = new Scanner(System.in);
        System.out.println("Imprima os valores ímpares entre um número e outro: ");
        System.out.println("Digite o primeiro valor: ");
        ponto.setValor1(Integer.parseInt(leitura.nextLine()));
        System.out.println("Digite o segundo valor: ");
        ponto.setValor2(Integer.parseInt(leitura.nextLine()));

        ponto.retornaImpares(ponto);

        for (Integer valor : ponto.getListaImpares()){
            System.out.println(valor);
        }
    }
}
