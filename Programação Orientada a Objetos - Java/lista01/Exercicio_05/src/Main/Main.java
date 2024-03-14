package Main;

import FormaGeometrica.Triangulo;
import Calculos.CalculaAreaTriangulo;
import Calculos.CalculaPerimetroTriangulo;

public class Main {

    public static void main(String[] args) {
        var t1 = new Triangulo(2.2, 2.2, 2.2);
        System.out.printf("Este triângulo é: %s\n", t1.verificaTriangulo(t1));
        System.out.printf("O Perímetro deste triângulo é: %.2f\nA área deste triângulo é: %.2f%n", CalculaPerimetroTriangulo.calculaPerimetroTriangulo(t1), CalculaAreaTriangulo.calculaAreaTriangulo(t1));
    }
}