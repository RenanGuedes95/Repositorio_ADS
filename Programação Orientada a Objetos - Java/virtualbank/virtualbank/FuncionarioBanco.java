public abstract class FuncionarioBanco
{
    private String nome, certificacaoCNPI;
    private double salario;
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getCertificacaoCNPI(){
        return certificacaoCNPI;
    }
    
    public void setCertificacaoCNPI(String certificacaoCNPI){
        this.certificacaoCNPI = certificacaoCNPI;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    
}
