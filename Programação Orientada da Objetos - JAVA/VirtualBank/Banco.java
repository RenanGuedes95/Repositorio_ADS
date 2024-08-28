import java.util.ArrayList;
public class Banco
{
    private String nome, sigla;
    private Gerente gerente;
    private ArrayList<Bancario> listaDeBancarios;
    private ArrayList<ContaBancaria> listaDeContas;
    
    public Banco(){
        listaDeBancarios = new ArrayList<>();
        listaDeContas = new ArrayList<>();
    }
    
    public void addConta(ContaBancaria conta){
        listaDeContas.add(conta);
    }
    
    public ArrayList<ContaBancaria> getContas(){
        return listaDeContas;
    }
    
    public ArrayList<Bancario> getBancario(){
        return listaDeBancarios;
    }
    
    public void addBancario(Bancario bancario){
        listaDeBancarios.add(bancario);
    }
    
    public Gerente getGerente(){
        return gerente;
    }
    
    public void setGerente(Gerente gerente){
        this.gerente = gerente;
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
