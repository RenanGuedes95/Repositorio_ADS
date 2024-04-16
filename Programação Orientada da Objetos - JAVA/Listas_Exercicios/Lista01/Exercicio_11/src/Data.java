import java.util.Date;

public class Data {
    private int dia, mes, ano;
    private Date dataAtual;

    public Data(int dia, int mes, int ano){
        if(dia >= 1 && dia <= verificaMes(mes)){
            this.dia = dia;
        }else{
            throw new RuntimeException("Dia inválido.");
        }
        if(mes >= 1 && mes <= 12) {
            this.mes = mes;
        }else{
            throw new RuntimeException("Mes inválido");
        }
        if(ano >= 1) {
            this.ano = ano;
        }
    }
    public Data(){
        dataAtual = new Date();
    }

    public int getDia(){
        return dia;
    }

    public void setDia(int dia){
        this.dia = dia;
    }

    public int getMes(){
        return mes;
    }

    public void setMes(int mes){
        this.mes = mes;
    }

    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public void avancarUmDia(){
        if(dia == verificaMes(mes) && mes < 12){
            dia = 1;
            mes++;
        }else if(mes == 12){
            dia = 1;
            mes = 1;
            ano++;
        }else{
            dia++;
        }
    }

    public int verificaMes(int mes) {
        switch (mes) {
            case 2:
                return 28;
            case 5:
                return 31;
            case 7:
                return 31;
            case 8:
                return 31;
            case 10:
                return 31;
            case 12:
                return 31;
        }
        return 30;
    }

    public void verificaData(){
        if(dia > verificaMes(mes) || mes > 12 || ano <= 0){
            throw new IllegalArgumentException("Data inválida.");
        }
    }
    @Override
    public String toString(){
        return "Data de hoje: " + dia +"/"
                + mes+"/"
                + ano;
    }
}
