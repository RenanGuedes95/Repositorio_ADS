// Faça uma função que receba um vetor de números inteiros por parâmetro e multiplique por -1 todos os elementos negativos desse vetor. A função deve retornar o número de elementos negativos encontrados. Restrição: não utilize comandos de repetição.

internal class Program
{

    public static int informaQuantidadeNegativos(int[] vetor, int indice = 0, int quantidadeDeNegativos = 0)
    {
        int tamanhoVetor = vetor.Length;
        if (indice > tamanhoVetor - 1)
        {
            return quantidadeDeNegativos;
        }
        else
        {
            if (vetor[indice] < 0)
            {
                vetor[indice] *= -1;
                quantidadeDeNegativos++;
            }
            Console.WriteLine($"Indice {indice} = {vetor[indice]} ");
            return informaQuantidadeNegativos(vetor, ++indice, quantidadeDeNegativos);
        }
    }
    public static void Main(string[] args)
    {
        var vetorInteiros = new int[] { -10, -20, -30, -40, -50, -60, -70, -80, -90, -100, -200, 300, -400, -500, -600, 700, 800, -900, 1000};
        Console.WriteLine($"\nNeste vetor existem {informaQuantidadeNegativos(vetorInteiros)} números negativos");
    }
}