public class Cobertura extends Imovel
{
 private boolean duplex;
 private boolean triplex;
 
 public Cobertura(){
     super(0,0,"");
 }
 
 public boolean isDuplex(){
     return duplex;
 }
 
 public void setDuplex(boolean duplex){
     this.duplex = duplex;
 }
 
 public boolean isTriplex(){
     return triplex;
 }
 
 public void setTriplex(boolean triplex){
     this.triplex = triplex;
 }
 
 public double valorVenal(){
     int calculoDuplex = (duplex) ? 2 : 1;
     int calculoTriplex = (triplex) ? 3 : 1;
     
     return (metrosQuadrados * 1000.00) * calculoDuplex * calculoTriplex;
 }
}
