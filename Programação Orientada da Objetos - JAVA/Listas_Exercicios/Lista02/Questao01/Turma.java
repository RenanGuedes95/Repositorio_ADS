import java.util.ArrayList;
public class Turma
{
   private String serie;
   private Escola escola;
   private Aluno representante;
   private ArrayList<Aluno> listaAlunos;
   public Turma(){
       
   }
   
   public Turma(String serie, Escola escola){
       this.serie = serie;
       this.escola = escola;
       this.listaAlunos = new ArrayList<>();
   }
   
   public String getSerie(){
       return serie;
   }
   
   public void setSerie(String serie){
       this.serie = serie;
   }
   
   public ArrayList<Aluno> getListaAlunos(){
       return listaAlunos;
   }
   
   public void addAluno(Aluno aluno){
       listaAlunos.add( aluno );
   }
   
   public Aluno getRepresentante(){
       return representante;
   }
   
   public void setRepresentante(Aluno representante){
       this.representante = representante;
   }
   
   public void votarRepresentante(Aluno aluno){
       aluno.setQuantidadeVotos(aluno.getQuantidadeVotos() + 1);
   }
}
