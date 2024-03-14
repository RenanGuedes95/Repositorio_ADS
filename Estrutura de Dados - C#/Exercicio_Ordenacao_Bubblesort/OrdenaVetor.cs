using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Exercicio_Ordenacao_Bubblesort
{
    public abstract class OrdenaVetor
    {
        public static void Troca(int[] vetor, int i, int j)
        {
            int auxiliar;

            {
                auxiliar = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = auxiliar;
            }
        }
    }
}