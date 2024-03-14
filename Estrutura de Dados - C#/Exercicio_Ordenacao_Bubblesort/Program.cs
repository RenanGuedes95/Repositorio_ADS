using System;
using System.Collections.Specialized;
using System.Xml.Serialization;
using Exercicio_Ordenacao_Bubblesort;

internal class Program
{
    public static void Main(string[] args)
    {
        int[] vetor = new int[] { 40, 20, 7, 80, 60, 50, 30, 10, 15, 90, 70, 300, 200, 100, 500, 400, 600, 700, 1000, 800 };


        int fim = vetor.Length - 1;

        do{
            int posicao = 0;
            for (int i = 0; i < fim; i++)
            {
                
                if (vetor[i] > vetor[i + 1])
                {
                    OrdenaVetor.Troca(vetor, i, i + 1);
                    posicao = i;
                }

            }
            fim = posicao;
        }while(fim >0);



        foreach (int item in vetor)
        {
            Console.WriteLine(item);
        }
    }
}