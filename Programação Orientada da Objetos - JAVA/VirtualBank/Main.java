public class Main
{
    public static void main(String [] args){
        ContaBancaria cb;
    
        System.out.println("Qual tipo de conta você deseja abrir ? (b)ancaria, (e)special ou (p)oupanca?");
        String escolha = "p";
    
        if(escolha.equals("b")){
        cb = new ContaBancaria("123");
        }else if(escolha.equals("e")){
        cb = new ContaEspecial("123", 1000);
        }else {
        cb = new ContaPoupanca("123");
        }
        
        cb.depositarQuantia(1500);
        if(cb instanceof ContaPoupanca){
            ((ContaPoupanca) cb).aplicarRendimento();    
        }
        
        System.out.print(cb.getSaldo());
    }
}
