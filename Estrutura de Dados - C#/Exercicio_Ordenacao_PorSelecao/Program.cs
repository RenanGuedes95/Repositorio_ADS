using System;
using System.Collections.Specialized;
using System.Diagnostics.Contracts;
internal class Program
{
    public static void Main(string[] args)
    {
        int[] vetor = new int[] { 10, 7, 4, 6, 3, 5, 2, 1, 8, 9 };

        imprimeVetor(vetor);
        Console.WriteLine();
        ordenaVetor(vetor);
        imprimeVetor(vetor);

    }
    public static void ordenaVetor(int[] vetor)
    {
        for (int i = 0; i < vetor.Length - 1; i++)
        {
            int indiceMenor = i;
            for (int j = i + 1; j < vetor.Length; j++)
            {
                if (vetor[j] < vetor[indiceMenor])
                {
                    indiceMenor = j;
                }
            }
                if (i != indiceMenor)
                {
                    Troca(vetor, i, indiceMenor);
                }
            
        }
    }
        public static void imprimeVetor(int[] vetor)
        {
            foreach (var indice in vetor)
            {
                Console.WriteLine(indice);
            }
        }

        public static void Troca(int[] vetor, int i, int j)
        {
            int aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
        }
}
