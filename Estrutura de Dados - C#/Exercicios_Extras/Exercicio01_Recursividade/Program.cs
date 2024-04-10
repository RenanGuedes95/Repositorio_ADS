/*Usando recursividade, calcule a soma de todos os valores de um array de reais.*/
using System;
using System.Runtime.InteropServices;

internal class Program
{
    public static void Main(string[] args)
    {
        var arrayReais = new double[] { 1.1, 1.5, 2.5, 2.9, 3.6, 3.7 };

        //Console.Write($"Soma dos valores do vetor: {somaValoresArray(arrayReais):N2}");
        somaValoresArray(arrayReais);
    }

    /*public static double somaValoresArray(double [] arrayReais, double soma = 0, int indice = 0){
        if(indice >= arrayReais.Length){
            return soma;
        }else{
        soma += arrayReais[indice];
        return somaValoresArray(arrayReais, soma, ++indice);
        }
    }*/

    public static void somaValoresArray(double[] arrayReais, double soma = 0, int indice = 0)
    {
        if (indice < arrayReais.Length)
        {
            soma += arrayReais[indice];
            somaValoresArray(arrayReais, soma, ++indice);
        }
        else
        {
            Console.Write($"Soma dos valores do vetor: {soma:N2}");
        }
    }


}