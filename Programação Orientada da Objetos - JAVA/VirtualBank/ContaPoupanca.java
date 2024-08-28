
public class ContaPoupanca extends ContaBancaria
{
    public ContaPoupanca(String numeroConta){
        this.setNumeroConta(numeroConta);
    }
    
    public double rendimentoPoupanca(){
        return saldo *= 0.01;
    }
    
    public void aplicarRendimento(){
        saldo += rendimentoPoupanca();
    }
}
