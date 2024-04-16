public class Main {
    public static void main(String[] args){
        Data data = new Data();
        data.setDia(31);
        data.setMes(12);
        data.setAno(2024);
        data.verificaData();

        Data data2 = new Data(31, 8, 1995);



        System.out.println(data.toString());
        data.avancarUmDia();
        System.out.println(data.toString());

        System.out.println(data2.toString());
        data2.avancarUmDia();
        System.out.println(data2.toString());
    }
}
