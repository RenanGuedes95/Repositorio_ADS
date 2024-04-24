import java.util.ArrayList;

public class Mestre extends Professor
{
    public Mestre(){
        
    }
    public Mestre(String nome){
        super(nome);
    }
    
    public double acrescimoMestrado(){
        return 25.00 * 0.45;
    }
    
    public double calculaSalario(){
        double salarioTotal = 0;
        for(Disciplina d : listaDisciplinas){
            salarioTotal += d.getCredito() * (d.isEAD() + acrescimoMestrado());
        }
        return salarioTotal;
    }
}
