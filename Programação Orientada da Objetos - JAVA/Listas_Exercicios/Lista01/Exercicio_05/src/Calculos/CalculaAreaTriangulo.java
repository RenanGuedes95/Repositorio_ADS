package Calculos;
import FormaGeometrica.Triangulo;
public abstract class CalculaAreaTriangulo {
    public static double calculaAreaTriangulo(Triangulo triangulo){
        return (triangulo.getLado1() * triangulo.getBase()) / 2;
    }
}
