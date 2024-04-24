import java.util.ArrayList;

public class Doutor extends Professor
{
    public Doutor(){
        
    }
    public Doutor(String nome){
        super(nome);
    }
    
    public double acrescimoDoutorado(){
        return 25.00 * 0.75;
    }
    
    public double calculaSalario(){
        double salarioTotal = 0;
        for(Disciplina d : listaDisciplinas){
            salarioTotal += d.getCredito() * (d.isEAD() + acrescimoDoutorado());
        }
        return salarioTotal;
    }
}
