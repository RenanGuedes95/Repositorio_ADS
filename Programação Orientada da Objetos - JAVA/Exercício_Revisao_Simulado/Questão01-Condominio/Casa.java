public class Casa extends Imovel implements CondominioFechado
{
    private int metragemTerreno;
    
    public Casa(){
        super(0,0,"");
    }
    
    public double valorVenal(){
        return metrosQuadrados * 1500.00;
    }
    
    public double valorTerreno(){
        return metragemTerreno * 350.00;
    }
    
    public double valorVenda(){
        return valorVenal() * 0.85 + valorTerreno();
    }
}
