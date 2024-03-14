package Empregado;

public class Empregado {
    private String nome;
    private int idade;
    private double tempoTrabalhado;

    public Empregado(){}
    public Empregado(String nome, int idade, double tempoTrabalhado){
        this.nome = nome;
        this.idade = idade;
        this.tempoTrabalhado = tempoTrabalhado;
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

    public double getTempoTrabalhado(){
        return tempoTrabalhado;
    }

    public void setTempoTrabalhado(double tempoTrabalhado){
        this.tempoTrabalhado = tempoTrabalhado;
    }

    public static boolean aptoAposentadoria(Empregado empregado){
        if(empregado.idade >= 65){
            return true;
        }else if(empregado.tempoTrabalhado >= 30){
            return true;
        }else if(empregado.idade >= 60 && empregado.tempoTrabalhado >= 25){
            return true;
        }
        return false;
    }

}
