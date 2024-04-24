import java.util.ArrayList;
public class ViannaJr
{
    private ArrayList<Professor> listaProfessores;
    
    public ViannaJr(){
        listaProfessores = new ArrayList<>();
    }
    
    public ArrayList getProfessor(){
        return listaProfessores;
    }
    
    public void addProfessor(Professor professor){
      listaProfessores.add (professor);  
    }
}
