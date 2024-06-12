using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Simulado_Prova02
{
    public class Fila<T>
    {
        private No<T> inicio = null;
        private No<T> final = null;

        public No<T> Inicio{
            get { return inicio; }
            set { inicio = value;}
        }

        public No<T> Final{
            get { return final; }
            set { final = value; }
        }

        public void Adcionar(T valor){
            var novoNo = new No<T>();
            novoNo.Valor = valor;

            if(final == null){
                inicio = final = novoNo;
            }else{
                final.Proximo = novoNo;
                final = novoNo;
            }
        }


        public void Remover(){
            if(inicio == null){
                throw new Exception("A lista está vazia");
            }

            inicio = inicio.Proximo;

            if(inicio == null){
                final = null;
            }
        }
    }
}