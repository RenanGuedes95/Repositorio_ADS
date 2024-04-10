/*Faça uma função recursiva que calcule e retorne o fatorial de um número inteiro N.*/

using System;
internal class Program{
    public static void Main(string[] args){
        Console.WriteLine(Fatorial(5));
    }

    public static int Fatorial(int num){
        if(num == 0){
            return 1;
        }  else {
            return num * Fatorial ( num - 1 );
        }
    }
}