public class Pessoa
{
    private String nome;
    private Endereco endereco;
    private String numero;
    
    public Pessoa(){
        
    }
    
    public Pessoa(String nome, Endereco endereco, String numero){
        this.nome = nome;
        this.endereco = endereco;
        this.numero = numero;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public Endereco getEndereco(){
        return endereco;
    }
    
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    
    public String getNumero(){
        return numero;
    }
    
    public void setNumero(String numero){
        this.numero = numero;
    }
    
    public Endereco consultaEndereco(){
        return endereco;
    }
    
    public String cnsultaNome(){
        return nome;
    }
}
