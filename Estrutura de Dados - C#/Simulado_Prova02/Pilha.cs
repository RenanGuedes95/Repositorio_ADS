using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Simulado_Prova02
{
    public class Pilha<T>
    {
        private No<T>? topo = null;
        private int tamanho = 0;

        public No<T>? Topo{
            get { return topo; }
            set { topo = value;}
        }

        public int Tamanho{
            get { return tamanho; }
            set { tamanho = value; }
        }
        public void Empilhar(T valor){
            var novoNo = new No<T>();
            novoNo.Valor = valor;

            novoNo.Proximo = topo;
            topo = novoNo;
            tamanho++;
        }

        public void Desempilhar(){
            if(topo == null){
                throw new Exception("Lista vazia");
            }

            topo = topo.Proximo;
            tamanho--;
        }
    }
}