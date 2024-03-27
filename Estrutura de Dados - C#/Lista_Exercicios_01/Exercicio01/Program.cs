/*Faça um procedimento que receba um número n inteiro e positivo. O procedimento deve
imprimir todos os números do intervalo entre 0 e n que são divisíveis por 2 e por 3
(simultaneamente). Restrição: não utilize comandos de repetição.*/
internal class Program{
    public static void Main(string[] args){
        
        Console.Write("Digite um número inteiro e positivo: ");
        int num = Convert.ToInt32(Console.ReadLine());

        imprimeIntervalo(num);
    }

    public static void imprimeIntervalo(int numero){
        if(numero == 0){
           return;
        }else{
            imprimeIntervalo(numero - 1);
            if(numero % 2 == 0 && numero % 3 == 0){
            Console.WriteLine(numero);
            }          
        }
    }
}