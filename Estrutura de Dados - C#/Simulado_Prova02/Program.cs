namespace Simulado_Prova02;

class Program
{
    static void Main(string[] args)
    {
        var pilha = new Pilha<string>();
        var fila = new Fila<string>();

        pilha.Empilhar("Olá");
        pilha.Empilhar("Olá");
        pilha.Empilhar("Olá");
        pilha.Empilhar("Olá");
        pilha.Empilhar("Olá");
        pilha.Empilhar("Eu");
        Console.WriteLine(pilha.Tamanho);        
        pilha.Desempilhar();
        Console.WriteLine(pilha.Tamanho);
        while(pilha.Tamanho > 0){
            Console.WriteLine(pilha.Topo.Valor);
            pilha.Desempilhar();
        }
        Console.WriteLine(pilha.Tamanho);        



        fila.Adcionar("Renan");
        fila.Adcionar(" Guedes");
        fila.Adcionar(" Brega");

        while(fila.Inicio != null){
            Console.Write(fila.Inicio.Valor);
            fila.Remover();
        }
    }
}
