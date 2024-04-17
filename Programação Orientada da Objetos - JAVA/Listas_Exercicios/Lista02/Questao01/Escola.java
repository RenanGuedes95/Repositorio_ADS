import java.util.ArrayList;
public class Escola
{
    private String nome;
    private String endereco;
    private ArrayList<Turma> listaTurmas;
    
    public Escola(){
        
    }
    
    public Escola(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
        this.listaTurmas = new ArrayList<>();
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    public ArrayList<Turma> getTurma(){
        return listaTurmas;
    }
    
    public void addTurma(Turma turma){
        listaTurmas.add( turma );
    }
}
