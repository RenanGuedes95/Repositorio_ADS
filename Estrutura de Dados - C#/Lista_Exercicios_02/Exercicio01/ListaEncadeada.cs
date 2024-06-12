using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Exercicio01
{
    public class ListaEncadeada
    {
        private No? primeiro = null;
        private No? ultimo = null;

        public No? Primeiro{
            get { return primeiro; }
            set { primeiro = value; }
        }

        public No? Ultimo{
            get { return ultimo; }
            set { ultimo = value; }
        }
        public void AddNoInicio(double valor){
            var novoNo = new No();
            novoNo.Valor = valor;

            if( primeiro == null){
                primeiro = ultimo = novoNo;
            }else{
                novoNo.Proximo = primeiro;
                primeiro = novoNo;
            }
        }

        public void AddNoFinal(double valor){
            var novoNo = new No();
            novoNo.Valor = valor;

            if(ultimo == null){
                primeiro = ultimo = novoNo;
            }else{
                ultimo.Proximo = novoNo;
                ultimo = novoNo;
            }
        }

        public void RemoverNoInicio(){
            if(primeiro == null){
                throw new Exception("Lista vazia");
            }
            if(primeiro == ultimo){
                primeiro = ultimo = null;
            }else{
                primeiro = primeiro.Proximo;
            }
        }

        public void RemoverNoFinal(){
            if(ultimo == null){
                throw new Exception("Lista Vazia");
            }
            if(ultimo == primeiro){
                ultimo = primeiro = null;
            }else{
                var penultimo = primeiro;
                while( penultimo?.Proximo?.Proximo != null){
                    penultimo = penultimo.Proximo;
                }
                if(penultimo != null){
                    penultimo.Proximo = null;
                    ultimo = penultimo;
                }
            }
        }
    }
}