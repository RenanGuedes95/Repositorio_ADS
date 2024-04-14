/*Faça uma função recursiva que permita inverter um número inteiro N. Ex: 123 - 321.*/

using System;
internal class Program{
    public static void Main(string[] args){
        Console.WriteLine(inverteNumero(123));
    }

    public static int inverteNumero(int numero){
        if(numero < 10){
            return numero;
        }else{
            int ultimoDigito = numero % 10;
            int numeroCom2Digitos = numero / 10;
            int numeroInvertido = inverteNumero(numeroCom2Digitos);
            return int.Parse(ultimoDigito.ToString() + numeroInvertido.ToString());
        }
    }
}