/*Faça uma função recursiva que receba um número inteiro 𝑛 por parâmetro e retorne a soma dos números inteiros entre zero e 𝑛. A função deve funcionar adequadamente tanto para 𝑛 positivo quanto para negativo. Para esse exercício não se pode utilizar as estruturas de repetição (for, while e do while).*/
using System;
using System.Runtime.InteropServices;

internal class Program{
    public static void Main(string[] args){
        Console.Write("Digite um número inteiro: ");
        int numero = Convert.ToInt32(Console.ReadLine());

        Console.Write($"Soma de {numero} até 0 = {somaNumeros(numero)}");
    }

    private static int somaNumeros(int numero){
        int soma = numero;
        if(numero > 0){
        soma += somaNumeros(numero - 1);
        }else if(numero < 0){
        soma += somaNumeros(numero + 1);
        }
        return soma;
    }
}