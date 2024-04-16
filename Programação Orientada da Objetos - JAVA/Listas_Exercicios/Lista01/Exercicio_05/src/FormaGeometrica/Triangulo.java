package FormaGeometrica;
public class Triangulo {
    private double lado1, lado2, base;

    public Triangulo(double lado1, double lado2, double base){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.base = base;
    }
    public Triangulo(){}

    public double getLado1(){
        return lado1;
    }

    public void setLado1(double lado1){
        this.lado1 = lado1;
    }

    public double getLado2(){
        return lado2;
    }

    public void setLado2(double lado2){
        this.lado2 = lado2;
    }

    public double getBase(){
        return base;
    }

    public void setBase(double base){
        this.base = base;
    }

    public String verificaTriangulo(Triangulo triangulo){
        if(triangulo.lado1 != triangulo.lado2 && triangulo.lado1 != triangulo.base && triangulo.lado2 != triangulo.base){
            return "Triângulo Escaleno";
        }
        if(triangulo.lado1 == triangulo.lado2 && triangulo.lado1 == triangulo.base){
            return "Triangulo Equilátero";
        }else{
            return "Triangulo Isóceles";
        }
    }
}