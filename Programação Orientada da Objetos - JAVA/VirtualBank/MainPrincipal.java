import java.util.Scanner;
public class MainPrincipal
{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        
        Banco banco = cadastrarBanco(leitor);
        System.out.println("Login do " + banco.getSigla()+"?");
        Bancario func = cadastrarBancario(leitor);
        
        verificaLogin(leitor, func, banco);
        Menu(leitor);
    }
    
    public static Banco cadastrarBanco(Scanner leitor){
        Banco banco = new Banco();
        banco.setNome("Banco do Brasil");
        banco.setSigla("BB");
        System.out.println("Nome do Gerente do " + banco.getSigla() + "?");
        banco.setGerente(new Gerente(leitor.nextLine()));
        
        return banco;
    }
    
    public static Bancario cadastrarBancario(Scanner leitor){
        System.out.println("Nome do Funcinoario?");
        Bancario func = new Bancario();
        return func;
        
    }
    
    public static void verificaLogin(Scanner leitor, Bancario func, Banco banco){
        System.out.print("Login?");
        String login = leitor.next();
        System.out.print("Senha?");
        String senha = leitor.next();
        if (!(login.equals("func") && senha.equals("123"))){
                System.out.println("Login Incorreto!!!");
                System.exit(-1);
        }
        
        System.out.println("########## BB Systems Corporations #########");
        banco.addBancario (func);
    }
    
    public static void Menu(Scanner leitor){
        while(true){
        System.out.println("### MENU PRINCIPAL");
            System.out.println("## 1) Abrir Conta");
            System.out.println("## 2) Consultar Conta");
            System.out.println("## 3) Consultar Cliente");
            System.out.println("## 4) Realizar Operaçoes");        
            System.out.println("## 5) Relatorio Financeiro");                
            System.out.println("###########################");
            System.out.println("## 6) Sair");
            int menu = leitor.nextInt();
        
            if (menu == 6){
                System.out.println("Ate Mais!!!");
                break;
            }
        }
    }
}
