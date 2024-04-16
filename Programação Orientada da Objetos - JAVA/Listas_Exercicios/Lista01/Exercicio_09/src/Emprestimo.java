public class Emprestimo {
    private double valorEmprestimo;
    private double porcentagemJuros;
    private int mesesParaPagamento;

    public Emprestimo(){

    }

    public Emprestimo(double valorEmprestimo, double porcentagemJuros, int mesesParaPagamento){
        this.valorEmprestimo = valorEmprestimo;
        if(porcentagemJuros >= 0) {
            this.porcentagemJuros = porcentagemJuros;
        }
        this.mesesParaPagamento = mesesParaPagamento;
    }


    public double getValorEmprestimo(){
        return valorEmprestimo;
    }

    public void setValorEmprestimo(double valorEmprestimo){
        this.valorEmprestimo = valorEmprestimo;
    }

    public double getPorcentagemJuros(){
        return porcentagemJuros;
    }

    public void setPorcentagemJuros(double porcentagemJuros){
        this.porcentagemJuros = porcentagemJuros;
    }

    public int getMesesParaPagamento(){
        return mesesParaPagamento;
    }

    public void setMesesParaPagamento(int mesesParaPagamento){
        this.mesesParaPagamento = mesesParaPagamento;
    }

    public double calculaValorMensalidade(){
        return (valorEmprestimo / mesesParaPagamento) + calculaJurosMensal();
    }

    public double calculaJurosMensal(){
        return (valorEmprestimo / mesesParaPagamento) * (porcentagemJuros / 100);
    }

    public double calculaValorTotalEmprestimo(){
        return calculaValorMensalidade() * mesesParaPagamento;
    }

    public double calculaValorTotalJuros(){
        return calculaJurosMensal() * mesesParaPagamento;
    }
}
