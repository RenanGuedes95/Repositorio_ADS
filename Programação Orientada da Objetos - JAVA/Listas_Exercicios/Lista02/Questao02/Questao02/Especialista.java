import java.util.ArrayList;

public class Especialista extends Professor
{
    public Especialista(){
        
    }
    public Especialista(String nome){
        super(nome);
    }
    
    public double acrescimoEspecializacao(){
        return 25.00 * 0.15;
    }
    
    public double calculaSalario(){
        double salarioTotal = 0;
        for(Disciplina d : listaDisciplinas){
            salarioTotal += d.getCredito() * (d.isEAD() + acrescimoEspecializacao());
        }
        return salarioTotal;
    }
}
