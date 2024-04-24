public class Disciplina
{
    private String nome;
    private Professor professor;
    private int credito;
    private boolean isEAD;
    
    public Disciplina(){
        
    }
    
    public Disciplina(String nome, Professor professor, int credito, boolean isEAD){
        this.nome = nome;
        this.professor = professor;
        this.credito = credito;
        this.isEAD = isEAD;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public Professor getProfessor(){
        return professor;
    }
    
    public void setProfessor(Professor professor){
        this.professor = professor;
    }
    
    public int getCredito(){
        return credito;
    }
    
    public void setCredito(int credito){
        this.credito = credito;
    }
    
    public double isEAD(){
        return (isEAD) ? 18.75 : 25.00;
    }
    
    public void setIsEAD(boolean isEAD){
        this.isEAD = isEAD;
    }
}
