using System;
using System.Collections.Generic;
using System.ComponentModel.Design.Serialization;
using System.Linq;
using System.Threading.Tasks;

namespace Lista_Exercicios_03_Arvores
{
    public class Tree
    {
        private Node? root;

        public Node? Root{
            get { return root; }
            set { root = value; }
        }

        public Tree(){
            Root = null;
        }
    }
}