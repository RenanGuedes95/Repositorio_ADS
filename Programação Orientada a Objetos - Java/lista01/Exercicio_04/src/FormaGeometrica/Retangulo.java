package FormaGeometrica;

public class Retangulo {
    private double comprimento;
    private double largura;

    public Retangulo(){}
    public Retangulo(double comprimento, double largura){
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double getComprimento(){
        return comprimento;
    }

    public void setComprimento(double comprimento){
        this.comprimento = comprimento;
    }

    public double getLargura(){
        return largura;
    }

    public void setLargura(double largura){
        this.largura = largura;
    }

    public double calculaPerimetro(Retangulo r){
        return (r.comprimento + r.largura) * 2.0;
    }

    public double calculaArea(Retangulo r){
        return r.comprimento * r.largura;
    }

}
