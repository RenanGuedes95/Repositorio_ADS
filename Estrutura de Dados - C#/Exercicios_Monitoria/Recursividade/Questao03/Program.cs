//Faça um procedimento recursivo que imprima todos os elementos de um vetor de inteiros separados por '-' (traço). Observação: traços só podem ser impressos se estiverem separando elementos do vetor, ou seja, não pode haver traço no início ou no final da impressão.

using System;

internal class Program{
    
    public static void imprimeVetor(int [] vetorInteiros, int indice = 0){
        if(indice == vetorInteiros.Length - 1){
            Console.Write($"{vetorInteiros[indice]}");
        }else{
            Console.Write($"{vetorInteiros[indice]} - ");
            imprimeVetor(vetorInteiros, ++indice);
        }
    }
    public static void Main(string[] args){
        var vetorInteiros = new int []  { 1,2,3,4,5, 6, 7, 8, 9, 10, 0 };

        imprimeVetor(vetorInteiros);
    }
}