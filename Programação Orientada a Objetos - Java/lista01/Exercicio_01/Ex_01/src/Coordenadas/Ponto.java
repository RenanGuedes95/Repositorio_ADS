package Coordenadas;

public class Ponto {
    private double x;
    private double y;

    public Ponto(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Ponto(){}

    public double getX(){
        return x;
    }

    public void setX(double x){
        this.x = x;
    }

    public double getY(){
        return y;
    }

    public void setY(double y){
        this.y = y;
    }

    public double retornaDistancia(Ponto p1, Ponto p2){
        return Math.sqrt((Math.pow((p2.x - p1.x),2)) + (Math.pow(p2.y - p1.y, 2)));
    }
}
