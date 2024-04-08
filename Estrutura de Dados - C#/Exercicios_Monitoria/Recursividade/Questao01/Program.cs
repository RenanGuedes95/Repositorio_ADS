/*Faça uma função recursiva que retorne a soma dos elementos pares, existentes em um vetor de inteiros.*/
using System;
using System.Runtime.InteropServices.Marshalling;

internal class Program
{
    public static int somaPares(int [] vetorInteiros, int indice = 0, int somaElementosPares = 0){
        if(indice >= vetorInteiros.Length){
            return somaElementosPares;
        }else{
            if(vetorInteiros[indice] % 2 == 0){
                somaElementosPares += vetorInteiros[indice];
            }
            return somaPares(vetorInteiros, ++indice, somaElementosPares);
        }
    }
    public static void Main(string[] args)
    {
        var vetorInteiros = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14, 14, 16, 16 };

        Console.Write($"Soma dos elementos pares do vetor = {somaPares(vetorInteiros)}");
    }
}