public class Empresa
{
    private String nome;
    private Funcionario [] listaDeFuncionarios;
    public Empresa(String nome, Funcionario [] listaDeFuncionarios){
        this.nome = nome;
        this.listaDeFuncionarios = listaDeFuncionarios;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        if(nome != null && nome != ""){
            this.nome = nome;
        }
    }
    
    public double somaSalarios(){
        double totalSalarios = 0;
        
        for(int i = 0; i < listaDeFuncionarios.length; i++){
            if(listaDeFuncionarios[i] != null){
                totalSalarios += listaDeFuncionarios[i].calculaSalarioLiquido();
            }
        }
        return totalSalarios;
    }
    
    public Funcionario identificaMaiorSalario(){
        Funcionario funcionarioMaiorSalario = listaDeFuncionarios[0];
        if(listaDeFuncionarios[0] == null){
            return null;
        }else{
        Funcionario maiorSalario = listaDeFuncionarios[0];
        for(int i = 0; i < listaDeFuncionarios.length; i++){
            if(listaDeFuncionarios[i].calculaSalarioLiquido() > funcionarioMaiorSalario.calculaSalarioLiquido()){
                if(listaDeFuncionarios[i] != null && listaDeFuncionarios[i].calculaSalarioLiquido() > maiorSalario.calculaSalarioLiquido()){
                  maiorSalario = listaDeFuncionarios[i];   
                }
            }
        }
        return maiorSalario;
        }
    }
}
