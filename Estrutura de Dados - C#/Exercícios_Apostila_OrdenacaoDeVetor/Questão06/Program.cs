/*Considere a classe Produto abaixo e faça três procedimentos que recebam por parâmetro um vetor de produtos e ordene esse vetor pelo código do produto. Utilize os métodos bolha, da inserção e da seleção para ordenar o vetor.*/

using System;
using System.Runtime.Serialization;
using System.Security.Cryptography;
using System.Xml.Serialization;

internal class Program{
    public static void Main(string[] args){
        var p3 = new Produto (125, "Iphone 13", 3500.00);
        var p1 = new Produto (123, "Iphone 11", 2500.00);
        var p2 = new Produto (124, "Iphone 12", 2800.00);
        var p5 = new Produto (127, "Iphone 15", 4500.00);
        var p4 = new Produto (126, "Iphone 14", 4000.00);

        var vetorProdutos = new Produto [] { p3, p4, p2, p5, p1 };
        imprimeVetor(vetorProdutos);
        Console.WriteLine();
        //bubbleSort(vetorProdutos);
        //insertionSort(vetorProdutos);
        selectionSort(vetorProdutos);
        imprimeVetor(vetorProdutos);

    }

    public static void bubbleSort(Produto [] vetorProdutos){
        for(int i = 0; i < vetorProdutos.Length; i++){
            for(int j = 0; j < vetorProdutos.Length - i - 1; j++){
                if (vetorProdutos[j].Codigo > vetorProdutos[j + 1].Codigo){
                    Troca(vetorProdutos, j, j + 1);
                }
            }
        }
    }

    //BubbleSort com um Do While e um for:
        /*public static void bubbleSort(Produto [] vetorProdutos){
            int fim = vetorProdutos.Length - 1;
            do{
                for(int i = 0; i < fim; i++){
                    if(vetorProdutos[i].Codigo > vetorProdutos[i+1].Codigo){
                        Troca(vetorProdutos, i, i+1);
                    }
                }   
                fim--;
            }while(fim > 0);
        }*/
    

    public static void insertionSort(Produto [] vetorProdutos){
        for(int i = 1; i < vetorProdutos.Length; i++){
            Produto chave = vetorProdutos[i];
            int j;
            for(j = i - 1; j >= 0 && chave.Codigo < vetorProdutos[j].Codigo; j--){
                vetorProdutos[j + 1] = vetorProdutos[j];
            }
            vetorProdutos[j+1] = chave;
        }
    }


    /*public static void insertionSort(Produto [] vetorProdutos){
        for(int i = 1; i < vetorProdutos.Length; i++){
            Produto chave = vetorProdutos[i];
            int j = i - 1;
            while( j>= 0 && chave.Codigo < vetorProdutos[j].Codigo){
                vetorProdutos[j + 1] = vetorProdutos[j];
                j--;
            }
            vetorProdutos[j+1] = chave;
        }
    }*/

    public static void selectionSort(Produto [] vetorProdutos){
        for ( int i = 0; i < vetorProdutos.Length; i++ ){
            int menorValor = i;
            for( int j = i + 1; j < vetorProdutos.Length; j++ ){
                if(vetorProdutos[j].Codigo < vetorProdutos[menorValor].Codigo){
                    menorValor = j;
                }
            }
            if(i != menorValor){
                    Troca(vetorProdutos, i, menorValor);
                }
        }
    }

    public static void Troca(Produto [] vetorProdutos, int i, int j){
        Produto aux = vetorProdutos[i];
        vetorProdutos[i] = vetorProdutos[j];
        vetorProdutos[j] = aux;
    }

    public static void imprimeVetor(Produto [] vetorProdutos){
        foreach (var produto in vetorProdutos)
        {
            Console.WriteLine($"Produto: {produto.Descricao} - Valor: {produto.Preco} - Codigo: {produto.Codigo}");
        }
    }
}