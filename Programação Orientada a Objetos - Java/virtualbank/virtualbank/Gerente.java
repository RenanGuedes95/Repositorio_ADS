import java.util.Date;
public class Gerente extends FuncionarioBanco
{
    private Date dataNascimento;
    
    public Gerente(){
        
    }
    
    public Date getDataNascimento(){
        return dataNascimento;
    }
    
    public void setDataNascimento(){
        this.dataNascimento = dataNascimento;
    }
}
