package Calculos;
import FormaGeometrica.Triangulo;

public abstract class CalculaPerimetroTriangulo {
    public static double calculaPerimetroTriangulo(Triangulo triangulo){

        return triangulo.getLado1() + triangulo.getLado2() + triangulo.getBase();
    }
}
