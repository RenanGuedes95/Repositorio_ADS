using System;
using System.Collections.Specialized;
using System.Diagnostics.Contracts;
internal class Program{
    public static void Main (string [] args){
        int [] vetor = new int[]{10, 7, 4, 6, 3, 5, 2, 1, 8, 9};

        imprimeVetor(vetor);
        Console.WriteLine();
        ordenaVetor(vetor);
        imprimeVetor(vetor);

    }
    public static void ordenaVetor(int[] vetor){
        for(int i = 1; i < vetor.Length; i++){
            int chave = vetor[i];
            int j = i - 1;

            while (j>=0 && chave < vetor[j]){
                vetor[j+1] = vetor[j];
                j--;
            }
            vetor[j+1] = chave;
        }
    }

    public static void imprimeVetor(int[] vetor){
        foreach (var indice in vetor)
        {
            Console.WriteLine(indice);
        }
    }
}