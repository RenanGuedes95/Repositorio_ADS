class Atleta{
    private string nome;
    private int idade;
    private double altura, peso;


    public Atleta(string nome, int idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }
    public string Nome{
        get{ return nome; }
        set{ 
            if(nome != null){
            nome = value; 
            }
        }
    }

    public int Idade{
        get{ return idade; }
        set{ 
            if(idade != 0){
            idade = value; 
            }
        }
    }

    public double Altura{
        get{ return altura; }
        set{ 
            if(altura != 0){
            altura = value; 
            }
        }
    }

    public double Peso{
        get{ return peso; }
        set{ 
            if(peso != 0){
            peso = value; 
            }
        }
    }

}