package Main;
import Coordenadas.Ponto;
import java.util.Scanner;
public class Main {
    public static void main (String[] args){
    Scanner leitura = new Scanner(System.in);
    Ponto A = new Ponto();
    Ponto B = new Ponto();

    System.out.println("Vamos calcular a distância entre o ponto A e o ponto B:");
    System.out.print("Digite o valor de X do Ponto A: ");
    A.setX(Double.parseDouble(leitura.next()));
    System.out.print("Digite o valor de Y do Ponto A: ");
    A.setY(Double.parseDouble(leitura.next()));

    System.out.print("Digite o valor de X do Ponto B: ");
    B.setX(Double.parseDouble(leitura.next()));
    System.out.print("Digite o valor de Y do Ponto B: ");
    B.setY(Double.parseDouble(leitura.next()));

    System.out.println(String.format("A distância entre os pontos A e B é: %.2f", A.retornaDistancia(A, B)));
    }
}