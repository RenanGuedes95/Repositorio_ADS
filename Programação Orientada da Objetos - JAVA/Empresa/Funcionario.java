public class Funcionario
{
    //Descrição dos atributos:
    private String nome,funcao;
    private double salarioBase, qtdVendas;
    private int qtdFilhos;
    private boolean adicionalNoturno, usaValeTransp;
    //Métodos Construtores:
    public Funcionario(String nome, String funcao, double salarioBase, int qtdFilhos,
    double qtdVendas, boolean adicionalNoturno, boolean usaValeTransp){
        if(nome != null && nome != ""){
            this.nome = nome;
        }else{
            return;
        }
        this.funcao = funcao;
        if(salarioBase < 0){
            return;
        }
        this.salarioBase = salarioBase;
        if(qtdFilhos >= 0 && qtdFilhos <= 3){
            this.qtdFilhos = qtdFilhos;
        } else{
            return;
        }
        this.qtdVendas = qtdVendas;
        this.adicionalNoturno = adicionalNoturno;
        this.usaValeTransp = usaValeTransp;
    }
    public Funcionario(){}
    
    //Métodos Getters e Setters:
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        if(nome != null && nome != ""){
            this.nome = nome;
        }
        return;
    }
    
    public String getFuncao(){
        return funcao;
    }
    
    public void setFuncao(String funcao){
        this.funcao = funcao;
    }
    
    public double getSalarioBase(){
        return salarioBase;
    }
    
    public void setSalarioBase(double salarioBase){
        if(salarioBase >= 0){
            this.salarioBase = salarioBase;
        }
    }
        
    public int getQtdFilhos(){
        return qtdFilhos;
    }
    
    public void setQtdFilhos(int qtdFilhos){
        if(qtdFilhos >= 0 && qtdFilhos <= 3){
            this.qtdFilhos = qtdFilhos;
        } 
    }
    
    public double getQtdVendas(){
        return qtdVendas;
    }
    
    public void setQtdVendas(int qtdVendas){
        this.qtdVendas = qtdVendas;
    }
    
    public boolean getAdicionalNoturno(){
        return adicionalNoturno;
    }
    
    public void setAdicionalNoturno(boolean adicionalNoturno){
        this.adicionalNoturno = adicionalNoturno;
    }
    
    public boolean getUsaValeTransp(){
        return usaValeTransp;
    }
    
    public void setUsaValeTransp(boolean usaValeTransp){
        this.usaValeTransp = usaValeTransp;
    } 
    
    //Métodos para calcular o salário líquido de cada funcionário:
    public double descontoInss(){
        return salarioBase * 0.13;
    }
    public double bonusGerente(){
        return funcao.toUpperCase().equals("GERENTE") ? salarioBase * 0.1 : 0.0;
    }
    public double bonusVendedor(){
        return funcao.toUpperCase().equals("VENDEDOR") ? qtdVendas * 0.02 : 0.0;
    }
    public double descontoValeTransp(){
        return usaValeTransp ? salarioBase * 0.03 : 0.0;
    }
    public double adicionalNoturno(){
        return adicionalNoturno ? salarioBase * 0.02 : 0.0;
    }
    public double bonusFilho(){
        return qtdFilhos < 3 ? (double)(qtdFilhos * 50) : 150.0;
    }
    public double calculaSalarioLiquido(){  
        return salarioBase - descontoInss() + bonusGerente() + bonusVendedor() - descontoValeTransp() + adicionalNoturno() + bonusFilho();
    }
    
    @Override
    public String toString(){
        return "Nome do funcionário: " + nome + "\nSalario do Funcionario: " + calculaSalarioLiquido(); 
    }
}
