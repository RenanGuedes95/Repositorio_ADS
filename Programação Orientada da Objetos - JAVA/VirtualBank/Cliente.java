import java.util.ArrayList;
public class Cliente
{
    private String nome;
    private ArrayList<ContaBancaria> listaDeContas;
    
    public Cliente(String nome){
        this.nome = nome;
        listaDeContas = new ArrayList<>();
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public ArrayList<ContaBancaria> getListaDeContas(){
        return listaDeContas;
    }
    
    public void addConta(ContaBancaria conta){
        listaDeContas.add(conta);
    }
    
    public double saldoTotalContas(){
        double somaSaldos = 0;
        for(ContaBancaria conta : listaDeContas){
            somaSaldos += conta.getSaldo();
        }
        return somaSaldos;
    }
}
