/*Faça um procedimento recursivo que receba por parâmetro um vetor 𝑣𝑒𝑡 de números reais e, multiplique por −1 todos os elementos negativos desse vetor. Para esse exercício não se pode utilizar as estruturas de repetição (for, while e do
while).*/
using System;

internal class Program
{
    public static void Empacotadora(int[] vetor)
    {
        int index = 0;
        multiplicaIndex(vetor, index);
    }

    public static void multiplicaIndex(int[] vetor, int index)
    {
        if(index < vetor.Length){
            if (vetor[index] < 0)
                {
                    vetor[index] *= -1;
                }
                Console.WriteLine($"Elemento {index} = {vetor[index]}");
                multiplicaIndex(vetor, ++index);
        }
    }
public static void Main(string[] args)
{
    var vetor = new int[] { -1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -200, -1000, -30, 40, -50};

    Empacotadora(vetor);
}
}