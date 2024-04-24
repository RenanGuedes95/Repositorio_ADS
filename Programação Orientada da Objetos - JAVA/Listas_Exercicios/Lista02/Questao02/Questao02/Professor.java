import java.util.ArrayList;
public abstract class Professor
{
    private String nome;
    //private double salario;
    //private int horasAula;
    protected ArrayList<Disciplina> listaDisciplinas;
    
    public Professor(){
        this.listaDisciplinas = new ArrayList<>();
    }
    public Professor(String nome){
        this.nome = nome;
        this.listaDisciplinas = new ArrayList<>();
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public ArrayList getListaDisciplinas(){
        return listaDisciplinas;
    }
    
    public void addDisciplina(Disciplina disciplina){
        listaDisciplinas.add(disciplina);
    }
    
    public int retornaTotalHorasAula(){
        int creditosTotais = 0;
        for(Disciplina d : listaDisciplinas){
            creditosTotais += d.getCredito();
        }
        return creditosTotais;
    }
    
    public abstract double calculaSalario();
}
