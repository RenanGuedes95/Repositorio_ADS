import java.util.ArrayList;
public class Condominio
{
    private String nome;
    private String endereco;
    private ArrayList<Despesa> listaDespesas;
    private ArrayList<Imovel> listaImoveis;
    private ArrayList<Pagamento> listaPagamentos;
    
    public Condominio(){
        
    }
    
    public Condominio(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
        this.listaDespesas = new ArrayList<>();
        this.listaImoveis = new ArrayList<>();
        this.listaPagamentos = new ArrayList<>();
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    public void setEnderco(String endereco){
        this.endereco = endereco;
    }
    
    public ArrayList<Despesa> getDespesa(){
        return listaDespesas;
    }
    
    public void addDespesa(Despesa despesa){
        listaDespesas.add( despesa );
    }
    
    public ArrayList<Pagamento> getPagamento(){
        return listaPagamentos;
    }
    
    public void addPagamento(Pagamento pagamento){
        listaPagamentos.add( pagamento );
    }
    
    public ArrayList<Imovel> getImoveis(){
        return listaImoveis;
    }
    
    public void addImovel(Imovel imovel){
        listaImoveis.add(imovel);
    }
    
    public double valorCondominio(int mesAno){
        double valorDespesas = 0;
        for(Despesa despesa : listaDespesas){
            if(mesAno == despesa.getMesAno()){
                valorDespesas += despesa.getValor();
            }
        }
        return valorDespesas / listaImoveis.size();
    }
    
    public String relatorio(int mesAno){
        String relatorio = "Mês:" + mesAno +"\n";
        relatorio += listaImoveis.size() + "apartamentos" + "("+totalPagamento(mesAno) + "pagos - " + (listaImoveis.size() - totalPagamento(mesAno)) + "não pagos)";
        relatorio += "Valor arrecadados: " + valorCondominio(mesAno) * listaImoveis.size() + "valor a ser pago" + (listaImoveis.size() - totalPagamento(mesAno)) * valorCondominio(mesAno); 
        return relatorio;
        
    }
    
    public int totalPagamento(int mesAno){
        int totalPagos = 0;
        for(Pagamento pg : listaPagamentos){
            totalPagos++;
        }
        return totalPagos;
    }
    
    public void pagarCondominio(Imovel imovel, int mesAno){
        Pagamento pg = new Pagamento(mesAno, valorCondominio(mesAno), imovel, this);
        addPagamento( pg );
        
    }
}
