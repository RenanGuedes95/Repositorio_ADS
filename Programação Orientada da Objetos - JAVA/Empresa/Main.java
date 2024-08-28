import java.util.Arrays;

public class Main
{
    public static void main(String[] args){
        //Criando os objetos funcionários:
        Funcionario f1 = new Funcionario("Renan Guedes Brega", "gerente", 20000.00, 0, 0, false, true);
        Funcionario f2 = new Funcionario("Zezinho", "vendedor", 3000.00, 1, 120000.00, true, false);
        Funcionario f3 = new Funcionario("Joaozinho", "vendedor", 2000.00, 0, 120000.00, false, true);
        //Criando um Array com os objetos criados:
        Funcionario [] listaDeFuncionarios = new Funcionario [] {f1, f2, f3};
        //Criando o objeto Empresa:
        Empresa e1 = new Empresa("Vianna", listaDeFuncionarios);
        
        //For each para imprimir o nome e o salário de cada funcionário:
        for (Funcionario item : listaDeFuncionarios){
            System.out.println(String.format("O funcionário %s tem o salário de R$%.2f."
        , item.getNome(), item.calculaSalarioLiquido()));
        }
        //Imprimindo o total dos salários pagos pela empresa e qual o funcionário com maior salário:
        System.out.println(String.format("O total dos salários pagos pela empresa é de: R$%.2f \nO funcionário com o maior salário é: %s", e1.somaSalarios(), e1.identificaMaiorSalario().toString()));
        }
}