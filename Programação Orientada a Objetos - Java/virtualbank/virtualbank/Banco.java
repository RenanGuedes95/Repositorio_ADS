import java.util.ArrayList;
public class Banco
{
    private String nome, sigla;
    private Gerente gerente;
    private ArrayList<Bancario> listaDeBancarios;
    private ArrayList<ContaBancaria> listaDeContas;
    
    public Banco(){
        
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getSigla(){
        return sigla;
    }
    
    public void setSigla(String sigla){
        this.sigla = sigla;
    }

}
