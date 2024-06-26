﻿using System.Runtime.InteropServices;
using System.Xml;

namespace Lista_Exercicios_03_Arvores;

class Program
{
    static void Main(string[] args)
    {   
        var arvoreBinaria = new Tree();
        arvoreBinaria.Root = new Node('A');
        arvoreBinaria.Root.Left = new Node('B');
        arvoreBinaria.Root.Right = new Node ('C');
        arvoreBinaria.Root.Right.Left = new Node('D');
        arvoreBinaria.Root.Right.Left.Left = new Node('G');
        arvoreBinaria.Root.Right.Left.Right = new Node('H');
        arvoreBinaria.Root.Right.Right = new Node ('E');
        arvoreBinaria.Root.Right.Right.Left = new Node('I');
        Console.Write("Pré Ordem: ");
        PreOrdem(arvoreBinaria.Root);
        Console.WriteLine();
        Console.Write("In-Ordem: ");
        InOrdem(arvoreBinaria.Root);
        Console.WriteLine();
        Console.Write("Pós Ordem: ");
        PosOrdem(arvoreBinaria.Root);
    }

    public static void PreOrdem(Node? node){
        if(node != null){
            Console.Write($"{node.Valor} ");
            PreOrdem(node.Left);
            PreOrdem(node.Right);
        }
    }

    public static void InOrdem(Node? node){
        if(node != null){
            InOrdem(node.Left);
            Console.Write($"{node.Valor} ");
            InOrdem(node.Right);
        }
    }

    public static void PosOrdem(Node? node){
        if(node != null){
            PosOrdem(node.Left);
            PosOrdem(node.Right);
            Console.Write($"{node.Valor} ");
        }
    }
}
