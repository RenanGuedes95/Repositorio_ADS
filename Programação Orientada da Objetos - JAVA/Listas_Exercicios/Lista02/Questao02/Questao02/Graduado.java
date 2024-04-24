import java.util.ArrayList;

public class Graduado extends Professor
{
    public Graduado(){
        
    }
    public Graduado(String nome){
        super(nome);
    }
    
    public double calculaSalario(){
        double salarioTotal = 0;
        for(Disciplina d : listaDisciplinas){
            salarioTotal += d.getCredito() * d.isEAD();
        }
        return salarioTotal;
    }
}
