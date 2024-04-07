/*Questão 2) Faça três procedimentos. Cada procedimento deve receber um vetor de atletas e reorganizar o mesmo em ordem decrescente do peso do atleta. O primeiro procedimento deve utilizar o método bolha, o segundo o método da inserção e o terceiro o método da seleção.*/

using System.Collections.Specialized;
using System.ComponentModel;
using System.Globalization;

internal class Program
{
    private static void Main(string[] args)
    {
        var atleta1 = new Atleta("Renan", 28, 1.80, 100.50);
        var atleta2 = new Atleta("Zezin", 25, 1.85, 87.00);
        var atleta3 = new Atleta("Junin", 30, 1.90, 98.00);
        var atleta4 = new Atleta("Marquin", 30, 1.90, 67.00);
        var atleta5 = new Atleta("Pedrin", 30, 1.90, 48.00);
        var atleta6 = new Atleta("Juquinha", 30, 1.90, 56.00);

        var atletas = new Atleta[] { atleta1, atleta2, atleta3, atleta4, atleta5, atleta6 };

        //bubbleSort(atletas);
        insertSort(atletas);
        imprimeVetor(atletas);
    }

    private static void bubbleSort(Atleta[] atletas)
    {
        var fim = atletas.Length - 1;
        do
        {
            for (int i = 0; i < fim; i++)
            {
                if (atletas[i].Peso > atletas[i + 1].Peso)
                {
                    trocaElementos(atletas, i, i + 1);
                }
            }
            fim--;
        } while (fim > 0);
    }

    private static void insertSort(Atleta [] atletas){
        for(int i = 1; i < atletas.Length; i++){
            Atleta chave = atletas[i];
            int j = i - 1;
            while(j >= 0 && chave.Peso < atletas[j].Peso){
                atletas[j+1] = atletas[j];
                j--;
            }
            atletas[j+1] = chave;
        }
    }

    private static void imprimeVetor(Atleta[] atletas)
    {
        foreach (var atleta in atletas)
        {
            Console.WriteLine($"Nome do atleta: {atleta.Nome} - Peso: {atleta.Peso:N2}KG");
        }
    }

    private static void trocaElementos(Atleta[] atletas, int i, int j)
    {
        Atleta auxiliar = atletas[i];
        atletas[i] = atletas[j];
        atletas[j] = auxiliar;
    }
}