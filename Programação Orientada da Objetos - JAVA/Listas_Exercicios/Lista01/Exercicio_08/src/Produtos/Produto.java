package Produtos;

public class Produto {
    private String nome, codigoDeBarras;
    private double preco;
    private int quantidadeEmEstoque;

public Produto(){

}
public Produto(String nome, String codigoDeBarras, double preco, int quantidadeEmEstoque){
    if(nome != null) {
        this.nome = nome;
    }
    this.codigoDeBarras = codigoDeBarras;
    if(preco >= 0){
        this.preco = preco;
    }
    if(quantidadeEmEstoque >= 0){
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null) {
            this.nome = nome;
        }
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco >= 0){
            this.preco = preco;
        }
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }
    public void setQuantidadeEmEstoque(int quantidadeEmEstoque){
        if(quantidadeEmEstoque >= 0){
            this.quantidadeEmEstoque = quantidadeEmEstoque;
        }
    }
    public String verificaDisponibilidade(){
        return (quantidadeEmEstoque > 0) ? "Produto em estoque" : "Produto fora de estoque";
    }

    public int venderProduto(int venda){
        if(quantidadeEmEstoque >= venda){
           return quantidadeEmEstoque -= venda;
        }else{
            return 0;
        }
    }

    @Override
    public String toString(){
    return "Produto: " + nome + "\nCodigo de Barras: " + codigoDeBarras + "\nPreço unitário: " + preco;
    }
}

