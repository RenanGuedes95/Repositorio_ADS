import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        var leitor = new Scanner(System.in);

        var emprestimo = new Emprestimo();
        menuInteracao(leitor, emprestimo);

        System.out.println("########### Empréstimo liberado ###########");
        System.out.printf("O valor total da mensalidade acrescido dos juros é de: R$%.2f", emprestimo.calculaValorMensalidade());
        System.out.printf("\nO valor total pago ao final do empréstimo será de: R$%.2f", emprestimo.calculaValorTotalEmprestimo());
        System.out.printf("\nO valor total de juros pago será de: R$%.2f", emprestimo.calculaValorTotalJuros());
    }

    public static void menuInteracao(Scanner leitor, Emprestimo emprestimo){
        System.out.println("########### Empréstimo ###########");
        System.out.print("Digite o valor total do empréstimo: R$");
        emprestimo.setValorEmprestimo(leitor.nextDouble());
        System.out.print("Digite a porcentagem de juros: ");
        emprestimo.setPorcentagemJuros(leitor.nextDouble());
        System.out.print("Digite o prazo em meses para pagamento do empréstimo: ");
        emprestimo.setMesesParaPagamento(leitor.nextInt());
    }
}
