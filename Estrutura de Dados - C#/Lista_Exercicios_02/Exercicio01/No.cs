using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Exercicio01
{
    public class No
    {
        private double valor;
        private No? proximo;
        public double Valor{
            get {return valor;}
            set {this.valor = value;}
        }

        public No? Proximo{
            get { return proximo; }
            set { proximo = value; }
        }
    }
}