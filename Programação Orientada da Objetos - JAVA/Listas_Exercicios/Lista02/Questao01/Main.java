import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
    static Scanner leitorGlobal = new Scanner(System.in);
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        Escola escola = new Escola("Escola", "Rua 1");
        Turma turma = new Turma("1º Ano do Ensino Médio", escola);

        while(true){
            int menu = menu();
            if(menu == 1){
                System.out.println("### Cadastro Eletrônico de alunos para eleição de representante de turma ###");
                if(turma.getListaAlunos().size() < 5){
                    cadastarAlunos(turma);
                }else{
                    System.out.println("### Não é possível cadastrar mais alunos... ###");
                }
            }else if(menu == 2){
                imprimirCandidatos(turma);
                for(int i = 0; i < turma.getListaAlunos().size(); i++){
                    System.out.println("Voto do Aluno " + (i + 1) + " de " + turma.getListaAlunos().size());
                    int opcao = leitor.nextInt() - 1;
                    turma.votarRepresentante(turma.getListaAlunos().get(opcao));
                }
            }else if (menu == 3){
                Aluno eleito = verificaResultadoEleicao(turma);
                System.out.println("O aluno " + eleito.getNome() + " está eleito para representante de turma com " + eleito.retornaPorcentagemVotos() + "% dos votos");
                System.out.println("Votação Encerrada");
                break;
            }else if( menu == 4){
                System.out.println("Votação encerrada");
                break;
            }
        }
    }

    public static int menu()
    {
        var leitor = new Scanner(System.in);
        System.out.println("############ Eleição para representante de turma #############");
        System.out.println("Digite a opção desejada:");
        System.out.println("1- Cadastrar Candidatos.");
        System.out.println("2- Votar.");
        System.out.println("3- Resultado.");
        System.out.println("4- Sair.");
        return leitor.nextInt();
    }

    public static void imprimirCandidatos(Turma turma){
        int indice = 1  ;
        System.out.println("############ Lista de Candidatos #############");
        for(Aluno a : turma.getListaAlunos()){
            System.out.println("Candidato " + (indice) + "- " + a.getNome());
            indice++;
        }
    }

    public static Aluno verificaResultadoEleicao(Turma turma){
        int maisVotado = 0;
        Aluno representante = turma.getListaAlunos().get(0);
        for (Aluno a : turma.getListaAlunos()){
            if(a.getQuantidadeVotos() > maisVotado){
                maisVotado = a.getQuantidadeVotos();
                representante = a;
            }
        }
        turma.setRepresentante(representante);
        return representante;
    }

    public static void cadastarAlunos(Turma turma){
        for(int i = 1; i <= 5; i++){
            Aluno aluno = new Aluno();
            System.out.println("Digite o nome do aluno "+ (i) +": ");
            aluno.setNome(leitorGlobal.next());
            System.out.println("Digite a idade do aluno "+ (i) +": ");
            aluno.setIdade(leitorGlobal.nextInt());
            aluno.setTurma(turma);
            turma.addAluno(aluno);
        }
    }

}
