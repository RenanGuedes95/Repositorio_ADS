/*Faça uma função recursiva que calcule e retorne o N-ésimo termo da sequência Fibonacci. Alguns números desta sequência são: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89...*/


using System;
using System.Text.Json.Serialization;
internal class Program{
    public static void Main(string[] args){
        Console.Write($"{calculaFibonacci(8)}");
    }

    public static int calculaFibonacci(int num){
        if(num <= 2){
            return 1;
        }else{
            return calculaFibonacci(num - 1) + calculaFibonacci(num - 2);
        }
    }
}