using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Simulado_Prova02
{
    public class No<T>
    {
        private T? valor;
        private No<T>? proximo;

        public T? Valor{
            get { return valor;}
            set { valor = value; }
        }

        public No<T>? Proximo{
            get { return proximo; }
            set { proximo = value; }
        }

    }
}