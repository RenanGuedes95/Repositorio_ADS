package Main;
import Produtos.Produto;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        /*var produto01 = new Produto("Celular", "123456", 4500.00, 100 );
        produto01.venderProduto(10);
        produto01.venderProduto(90);*/
        var leitor = new Scanner(System.in);
        var produto01 = new Produto();
        System.out.println("Cadastre o seu produto: ");
        System.out.print("Digite o nome do produto: ");
        produto01.setNome(leitor.nextLine());
        System.out.print("Digite o código de barras: ");
        produto01.setCodigoDeBarras(leitor.nextLine());
        System.out.print("Digite o preço unitário do produto: ");
        produto01.setPreco(Double.parseDouble(leitor.nextLine()));
        System.out.print("Quantidade em estoque do produto: ");
        produto01.setQuantidadeEmEstoque(Integer.parseInt(leitor.nextLine()));
        System.out.println("Produto cadastrado com sucesso...");
        System.out.println();

        System.out.println(produto01.toString() + "\n" + produto01.verificaDisponibilidade() + "\nQuantidade em estoque: " + produto01.getQuantidadeEmEstoque());

        System.out.println();
        System.out.println("Vender o  produto: " + produto01.getNome());
        System.out.print("Qual a quantidade você quer vender ? ");
        int i = Integer.parseInt(leitor.nextLine());
        while (i > produto01.getQuantidadeEmEstoque()) {
            System.out.println("Quantidade excede o limite do estoque...");
            System.out.print("Qual a quantidade você quer vender ? ");
            i = Integer.parseInt(leitor.nextLine());
        }
        produto01.venderProduto(i);
        System.out.println("Processando venda...");
        System.out.println();
        System.out.println("Venda realizada com sucesso.");
        System.out.println();


        System.out.println("Quantidade em estoque atualizada: " + produto01.getQuantidadeEmEstoque());

    }
}