/*Faça uma função recursiva que retorne o maior número existente em um vetor de números reais.*/
using System;

internal class Program{
    public static double retornaMaiorNumero(double [] vetorReais, int indice = 0, double maiorNumero = 0){
        if(indice == vetorReais.Length - 1){
            return maiorNumero;
        }else{
            if(vetorReais[indice] > maiorNumero){
            maiorNumero = vetorReais[indice];
            }
        }
        return retornaMaiorNumero(vetorReais, ++indice, maiorNumero);

    }
    public static void Main(string [] args){
        var vetorReais = new double [] {1.2, 2.6, 1.4, 1.5, 2.5, 2.8, 1.9, 2.4};

        Console.Write($"Maior número do vetor = {retornaMaiorNumero(vetorReais)}");
    }
}