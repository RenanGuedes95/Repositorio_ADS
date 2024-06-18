using System;
using System.Collections.Generic;
using System.Dynamic;
using System.Linq;
using System.Net.WebSockets;
using System.Threading.Tasks;

namespace Lista_Exercicios_03_Arvores
{
    public class Node
    {
        private char valor;
        private Node? left;
        private Node? right; 

        public char Valor{
            get { return valor; }
            set { valor = value;}
        }

        public Node? Left{
            get { return left; }
            set { left = value;}
        }
        public Node? Right{
            get { return right; }
            set { right = value;}
        }

        public Node(char value){
            Valor = value;
            Left = null;
            Right = null;
        }                 
    }
}