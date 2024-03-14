package Animal;

public class Cachorro extends Animal{
    private String raca;

    public Cachorro (String nome, int idade, String raca){
        this.setNome(nome);
        this.setIdade(idade);
        this.setRaca(raca);
    }
    public String getRaca(){
        return raca;
    }
    public void setRaca(String raca){
        this.raca = raca;
    }

    @Override
    public String toString(){
        return super.toString() + "\nRaça: " + raca + "}";
    }
}
