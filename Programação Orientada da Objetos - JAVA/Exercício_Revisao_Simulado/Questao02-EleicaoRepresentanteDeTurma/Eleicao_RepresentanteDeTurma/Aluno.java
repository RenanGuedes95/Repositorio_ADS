public class Aluno
{
    private String nome;
    private int idade;
    private int quantidadeVotos;
    private Turma turma;
    
    public Aluno(){
        
    }
    
    public Aluno(String nome, int idade, Turma turma){
        this.nome = nome;
        this.idade = idade;
        this.turma = turma;
        this.quantidadeVotos = 0;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public int getQuantidadeVotos(){
        return quantidadeVotos;
    }
    
    public void setQuantidadeVotos(int quantidadeDeVotos){
        this.quantidadeVotos = quantidadeDeVotos;
    }
    
    public Turma getTurma(){
        return turma;
    }
    
    public void setTurma(Turma turma){
        this.turma = turma;
    }
    
}
