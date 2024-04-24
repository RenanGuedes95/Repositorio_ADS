import java.util.Scanner;
public class Main
{
    static Scanner leitor = new Scanner(System.in);
    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
        ViannaJr vianna = new ViannaJr();
        Professor prof = cadastrarProfessor();
        vianna.addProfessor(prof);
        cadastrarDisciplinas(prof);
        
        System.out.printf("O salário do professor é: R$" + prof.calculaSalario());
    }
    
    public static Professor cadastrarProfessor(){
        Professor prof = null;
        Scanner leitor = new Scanner(System.in);
        while(prof == null){
            System.out.println("### CADASTRO DE PROFESSOR ###");
            System.out.print("Digite a formação do professor: ");
            String formacaoProfessor = leitor.nextLine();
            if(formacaoProfessor.equals("Graduado")){
                prof = new Graduado();
            }else if(formacaoProfessor.equals("Especialista")){
                prof = new Especialista();
            }else if(formacaoProfessor.equals("Mestre")){
                prof = new Mestre();
            }else if (formacaoProfessor.equals("Doutor")){
                prof = new Doutor();
            }else{
                System.out.println("Não existe essa formação");
                System.out.println();
            }
        }
        System.out.print("Digite o nome do Professor: ");
        prof.setNome(leitor.nextLine());
        return prof;
    }
    
    public static void cadastrarDisciplinas(Professor prof){
        while(true){
            System.out.println("### CADASTRO DE DISCIPLINAS ##");
            Disciplina disciplina = new Disciplina();
            System.out.println("Digite o nome da disciplina:");
            disciplina.setNome(leitor.nextLine());
            System.out.println("Digite a quantidade de créditos da disciplina:");
            disciplina.setCredito(leitor.nextInt());
            leitor.nextLine();
            System.out.println("A disciplina é EAD ?");
            disciplina.setIsEAD(leitor.nextBoolean());
            disciplina.setProfessor(prof);
            prof.addDisciplina(disciplina);
            System.out.println("Você deseja cadastrar outra disciplina ?");
            System.out.println("1- Sim\n2- Não");
            int opcao = leitor.nextInt();
            leitor.nextLine();
            if(opcao != 1){
                System.out.println("Cadastro encerrado");
                break;
            }
        }
    }
}