package Main;
import Empregado.Empregado;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Empregado emp = new Empregado();

        System.out.println("Digite o nome do empregado: ");
        emp.setNome(leitor.nextLine());
        System.out.println("Digite a idade do empregado: ");
        emp.setIdade(Integer.parseInt(leitor.next()));
        System.out.println("Digite o tempo de trabalho do empregado: ");
        emp.setTempoTrabalhado(Double.parseDouble(leitor.next()));

        if (Empregado.aptoAposentadoria(emp)) {
            System.out.printf("O empregado %s está apto a aposentar...", emp.getNome());
        } else {
            System.out.printf("O empregado %s não está apto a aposentar...", emp.getNome());
        }
    }
}
