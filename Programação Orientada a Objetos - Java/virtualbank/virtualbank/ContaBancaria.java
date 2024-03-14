public class ContaBancaria
{
    private Cliente correntista;
    private double saldo;
    private String numeroConta;
    private Banco banco;
    
    
    public ContaBancaria(){
        
    }
    
    public ContaBancaria(String numeroConta){
        this.numeroConta = numeroConta;
        saldo = 0;
    }
    
    public Cliente getCorrentista(){
        return correntista;
    }
    
    public void setCorrentista(Cliente correntista){
        this.correntista = correntista;
    }
    
    public String getNumeroConta(){
        return numeroConta;
    }
    
    public void setNumeroConta(String numeroConta){
        this.numeroConta = numeroConta;
    }
    
    public Banco getBanco(){
        return banco;
    }
    
    public void setBanco(Banco banco){
        this.banco = banco;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void sacarQuantia(double valorSacado){
        if(valorSacado <= saldo && valorSacado >= 0){
            this.saldo -= valorSacado;
        }
    }
    
    public void depositarQuantia(double valorDepositado){
        if(valorDepositado >= 0){
            this.saldo += valorDepositado;
        }
    }    
}
