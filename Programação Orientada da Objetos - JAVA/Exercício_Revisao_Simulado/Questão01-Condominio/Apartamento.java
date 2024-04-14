public class Apartamento extends Imovel
{
    private int numeroQuartos;
    
    public Apartamento(){
        super(0,0,"");
    }
    
    public int getNumeroQuartos(){
        return numeroQuartos;
    }
    
    public void setNumeroQuartos(int numeroQuartos){
        this.numeroQuartos = numeroQuartos;
    }
    
    public double valorVenal(){
        return (metrosQuadrados * 1.000) + (numeroQuartos * 500.00);
    }
}
