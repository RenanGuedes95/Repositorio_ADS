package Valores;

import java.util.ArrayList;
public class Valores {
    private int valor1, valor2;
    private ArrayList<Integer> listaImpares = new ArrayList<Integer>();
    public Valores(int valor1, int valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    public Valores(){}

    public int getValor1(){
        return valor1;
    }

    public void setValor1(int valor1){
        this.valor1 = valor1;
    }

    public int getValor2(){
        return valor2;
    }

    public void setValor2(int valor2){
        this.valor2 = valor2;
    }

    public ArrayList<Integer> getListaImpares(){
        return listaImpares;
    }
    public ArrayList<Integer> retornaImpares(Valores v1){

        for(int i = valor1; i <= valor2; i++){
            if(i % 2 != 0){
                listaImpares.add(i);
            }
        }
        return listaImpares;
    }
}
