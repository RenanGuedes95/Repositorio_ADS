/*Dado um array de inteiros e o seu número de elementos, inverta a posição dos seus elementos.*/

using System;
internal class Program{
    public static void Main(string[] args){
        var arrayInteiros = new int [] { 1,2,3,4,1,6,7,8,9,10 };

        ordenarVetor(arrayInteiros);

    }
    

    public static void ordenarVetor(int [] arrayInteiros, int i = 0){
        int j = arrayInteiros.Length - 1 - i;
        if(i < j){
            Troca(arrayInteiros, i, j);
            ordenarVetor(arrayInteiros, ++i);
        }    
    }

    public static void Troca(int [] arrayInteiros, int i, int j){
        int aux = arrayInteiros[i];
        arrayInteiros[i] = arrayInteiros[j];
        arrayInteiros[j] = aux;
    }
}