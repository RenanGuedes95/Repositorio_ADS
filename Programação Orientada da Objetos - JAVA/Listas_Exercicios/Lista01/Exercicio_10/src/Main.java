public class Main {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa("Xiquinha", "verde", "loiro", 1.80, "F", 28);
        Pessoa p2 = new Pessoa("Zezin", "preto", "castanho", 1.90, "M", 29);
        Pessoa p3 = new Pessoa("Pedrin", "azul", "azul", 1.91, "M", 30);
        Pessoa p4 = new Pessoa("Gustinha", "verde", "castanho", 1.91, "F", 30);
        p1.addPessoa(p1);
        p2.addPessoa(p2);
        p3.addPessoa(p3);
        p4.addPessoa(p4);

        System.out.printf("A maior altura dos habitantes é: %.2fm\nA menor altura dos habitantes é: %.2fm\n", Pessoa.calculaMaiorAltura(), Pessoa.calculaMenorAltura());
        System.out.printf("A média de altura das mulheres é de: %.2fm\n", Pessoa.calculaMediaAlturaMulheres());
        System.out.printf("A quantidade de homens é de: %d\n", Pessoa.quantidadeDeHomens());
        System.out.printf("A porcentagem de homens é de: %.2f por cento.\n", Pessoa.porcentagemDeHomens());
        System.out.printf("A porcentagem de mulheres é de: %.2f por cento.\n", Pessoa.porcentagemDeMulheres());
        System.out.printf("A porcentagem de mulheres loiras, de olhos verdes e com idade entre 18 e 35 anos é de: %.2f por cento.", Pessoa.porcentagemMulheresOlhoVerde());
    }
}
