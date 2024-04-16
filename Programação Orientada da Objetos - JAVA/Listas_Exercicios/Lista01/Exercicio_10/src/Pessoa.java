import java.util.ArrayList;
public class Pessoa {
    private String nome, corDosOlhos, corDoCabelo;
    private double altura;
    private String sexo;
    private int idade;

    private static ArrayList<Pessoa> listaDePessoas = new ArrayList<>();


    public Pessoa(String nome, String corDosOlhos, String corDoCabelo, double altura, String sexo, int idade) {
        this.nome = nome;
        this.corDosOlhos = corDosOlhos;
        this.corDoCabelo = corDoCabelo;
        this.altura = altura;
        this.sexo = sexo;
        this.idade = idade;
    }

    public Pessoa(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCorDosOlhos() {
        return corDosOlhos;
    }

    public void setCorDosOlhos(String corDosOlhos) {
        this.corDosOlhos = corDosOlhos;
    }

    public String getCorDoCabelo() {
        return corDoCabelo;
    }

    public void setCorDoCabelo(String corDoCabelo) {
        this.corDoCabelo = corDoCabelo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public ArrayList<Pessoa> getPessoa(){
        return listaDePessoas;
    }

    public void addPessoa(Pessoa pessoa){
        listaDePessoas.add(pessoa);
    }
    public static double calculaMaiorAltura(){
        double maiorAltura = 0;
        for(Pessoa p : listaDePessoas){
            if(p.altura > maiorAltura){
                maiorAltura = p.altura;
            }
        }
        return maiorAltura;
    }

    public static double calculaMenorAltura(){
        double menorAltura = calculaMaiorAltura();
        for(Pessoa p: listaDePessoas){
            if(p.altura <= menorAltura){
                menorAltura = p.altura;
            }
        }
        return menorAltura;
    }

    public static double calculaMediaAlturaMulheres(){
        double media = 0;
        double totalAltura=0;
        int quantidadeMulheres = 0;
        for(Pessoa p : listaDePessoas){
            if(p.sexo.equalsIgnoreCase("F"))
            {
                totalAltura += p.altura;
                quantidadeMulheres++;
            }
        }
        if(quantidadeMulheres == 0){
            return 0;
        }
        return media += (totalAltura / quantidadeMulheres);
    }

    public static boolean ehHomem(Pessoa p){
        if(p.sexo.equals("M")){
            return true;
        }
        return false;
    }
    public static int quantidadeDeMulheres(){
        int quantidadeDeMulheres = 0;
        for(Pessoa p:listaDePessoas){
            if(!ehHomem(p)){
                quantidadeDeMulheres++;
            }
        }
        return quantidadeDeMulheres;
    }

    public static int quantidadeDeHomens(){
        int quantidadeHomens = 0;
        for(Pessoa p:listaDePessoas){
            if(ehHomem(p)){
                quantidadeHomens++;
            }
        }
        return quantidadeHomens;
    }

    public static double porcentagemDeHomens(){
        return quantidadeDeHomens() *(100.00 / listaDePessoas.size());
    }

    public static double porcentagemDeMulheres(){
        return (quantidadeDeMulheres() * 100.00) / listaDePessoas.size();
    }

    public static int quantidadeMulheresOlhoVerde(){
        int mulheresOlhoVerde = 0;
        for(Pessoa p : listaDePessoas){
            if(!ehHomem(p) && p.idade >= 18 && p.idade <=35 && p.corDosOlhos.toUpperCase().equals("VERDE") &&
            p.corDoCabelo.toUpperCase().equals("LOIRO")){
                mulheresOlhoVerde++;
            }
        }
        return mulheresOlhoVerde;
    }

    public static double porcentagemMulheresOlhoVerde(){
        return (quantidadeMulheresOlhoVerde() * 100.00) / listaDePessoas.size();
    }
}
