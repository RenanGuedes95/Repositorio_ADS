import java.util.Date;
public class Gerente extends FuncionarioBanco
{
    private Date dataNascimento;
    
    public Gerente(){
        
    }
    
    public Gerente(String nome){
        dataNascimento = new Date();
    }
    
    public Date getDataNascimento(){
        return dataNascimento;
    }
    
    public void setDataNascimento(){
        this.dataNascimento = dataNascimento;
    }
}
