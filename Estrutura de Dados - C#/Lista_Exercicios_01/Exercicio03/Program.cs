/*Faça um procedimento que receba o montante reservado para a aposentadoria de uma pessoa e a quantia que ela pretende retirar por mês. O montante reservado é corrigido a cada mês com a taxa de 0,55%, aplicada logo após a retirada. O procedimento deve imprimir o montante (após a retirada e a correção), mês a mês. O procedimento também deve imprimir o número de meses em que a pessoa conseguirá fazer a sua retirada. Restrição: não utilize comandos de repetição.*/
using System.Reflection.Metadata.Ecma335;

namespace Exercicio03;

internal class Program
{
    public static void InformaAposentadoria(double valorSeparado, double valorRetiradoMensal, int meses = 0){
        if(valorRetiradoMensal >= valorSeparado){
            Console.Write("ALERTA: O valor em sua conta é menor do que o valor que deseja retirar.\n");
            Console.Write($"Você poderá retirar o seu dinheiro por {meses} meses");
            return;
        }else{
                valorSeparado -= valorRetiradoMensal;
                valorSeparado += valorSeparado * 0.0055;
                meses++;
                Console.WriteLine($"Mes {meses}: {valorSeparado:C2} após a correção e retirada");
                InformaAposentadoria(valorSeparado, valorRetiradoMensal, meses);
            }
    }
    static void Main(string[] args)
    {
        Console.Write("Digite o valor total separado para aposentadoria: ");
        double valorSeparado = Convert.ToDouble(Console.ReadLine());

        Console.Write("Digite o valor que quer resgatar mensalmente: ");
        double valorRetiradoMensal = Convert.ToDouble(Console.ReadLine());

        InformaAposentadoria(valorSeparado, valorRetiradoMensal);
    }
}
