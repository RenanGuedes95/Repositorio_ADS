/* Questão 1) Faça uma função recursiva que receba um número inteiro por parâmetro e retorne true se o número for um número perfeito ou false caso contrário. Um número perfeito é um número natural para o qual a soma de todos os seus divisores naturais próprio é igual ao próprio número. Esta função não pode utilizar comandos de repetição.
Alguns números perfeitos:	6	28	496	8128 */

using System;
using System.ComponentModel;
using System.Reflection.Metadata;
using System.Runtime.CompilerServices;

internal class Program{
    public static void Main(string[] args){
        Console.WriteLine("Digite um número para verificar se é perfeito: ");
        int num = Convert.ToInt32(Console.ReadLine());

        Console.WriteLine($"{ehPerfeito(num)}");
    }

    public static bool ehPerfeito(int num, int soma = 0, int divisores = 1){
        if(num == divisores){
            if(num == soma){
                return true;
            }else{
                return false;
            }
        }else{
            if(num % divisores == 0){
                soma += divisores;
            }
        } 
        return ehPerfeito(num, soma, ++divisores);
    }
}