public class ContaEspecial extends ContaBancaria
{
    private double limite;
    
    public ContaEspecial(String numero, double limite){
        this.limite = limite;
        setNumeroConta(numero);
    }
    
    public double getLimite(){
        return limite;
    }
    
    @Override
    public void sacarQuantia(double valor){
        if(valor >= 0 && valor <= (getSaldo() + limite)){
            saldo -= valor;
        }
    }
}
