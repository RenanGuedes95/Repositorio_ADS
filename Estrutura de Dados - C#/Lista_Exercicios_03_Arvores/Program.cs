using System.Runtime.InteropServices;
using System.Xml;

namespace Lista_Exercicios_03_Arvores;

class Program
{
    static void Main(string[] args)
    {   
        var arvoreBinaria = new Tree();
        var root = new Node('A');
        arvoreBinaria.Root = root;
        root.Left = new Node('B');
        root.Right = new Node ('C');
        root.Right.Left = new Node('D');
        root.Right.Left.Left = new Node('G');
        root.Right.Left.Right = new Node('H');
        root.Right.Right = new Node ('E');
        root.Right.Right.Left = new Node('I');
        Console.Write("Pré Ordem: ");
        PreOrder(arvoreBinaria.Root);
        Console.WriteLine();
        Console.Write("In-Ordem: ");
        InOrdem(arvoreBinaria.Root);
        Console.WriteLine();
        Console.Write("Pós Ordem: ");
        PosOrdem(arvoreBinaria.Root);
    }

    public static void PreOrder(Node? node){
        if(node != null){
            Console.Write($"{node.Valor} ");
            PreOrder(node.Left);
            PreOrder(node.Right);
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
