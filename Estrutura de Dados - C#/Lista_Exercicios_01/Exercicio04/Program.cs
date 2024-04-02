/*Faça uma função que ordene um vetor de inteiros passado por parâmetro utilizando o método bolha e retorne o número de trocas realizadas.*/
using System.Collections.Specialized;
using System.Globalization;
using System.Reflection.Metadata;

namespace Exercicio04;

internal class Program
{
    public static int retornaNumerodeTrocas(int[] vetorInteiros)
    {
        int quantidadeTrocas = 0;
        int fim = vetorInteiros.Length - 1;
        do
        {
            for (int i = 0; i < fim; i++)
            {
                if (vetorInteiros[i] > vetorInteiros[i + 1])
                {
                    TrocaIndices(vetorInteiros, i, i+1);
                    quantidadeTrocas++;
                }
            }
            fim--;
        } while (fim > 0);
        return quantidadeTrocas;
    }

    public static void TrocaIndices(int[] vetor, int i, int j)
    {
        int auxiliar = vetor[j];
        vetor[j] = vetor[i];
        vetor[i] = auxiliar;
    }

    public static void imprimeVetorOrdenado(int[] vetor)
    {
        foreach (var indice in vetor)
        {
            Console.Write($"{indice} ");
        }
    }

    static void Main(string[] args)
    {
        var vetorInteiros = new int[] { 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

        int numeroDeTrocas = retornaNumerodeTrocas(vetorInteiros);
        imprimeVetorOrdenado(vetorInteiros);
        Console.Write($"\nPara ordenar este vetor foram realizadas {numeroDeTrocas} trocas.");
    }
}