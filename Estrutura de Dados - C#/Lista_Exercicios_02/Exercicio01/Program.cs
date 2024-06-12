namespace Exercicio01;

class Program
{
    static void Main(string[] args)
    {
        var lista = new ListaEncadeada();

        lista.AddNoInicio(10.5);
        lista.AddNoInicio(2.8);
        lista.AddNoInicio(3.9);


        lista.AddNoFinal(1.9);
        lista.AddNoFinal(1.8);

        lista.RemoverNoInicio();
        lista.RemoverNoFinal();
        Console.Write(lista.Ultimo.Valor);


        //imprimirLista(lista);
    }
}
