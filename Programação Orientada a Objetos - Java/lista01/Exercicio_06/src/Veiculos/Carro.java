package Veiculos;
import Acessorios.Acessorios;
import Impostos.ImpostoIPI;
import Impostos.ImpostoImportado;

public class Carro {
        String marca, modelo;
        int anoDeFabricacao;
        double potenciaDoMotor, valorBase;
        boolean ehImportado;
        Acessorios acessorios;

        public Carro(){
        }
        public Carro(String marca, String modelo, int anoDeFabricacao, double potenciaDoMotor, double valorBase, boolean ehImportado,
        Acessorios acessorios){
        this.marca = marca;
        this.modelo = modelo;
        this.anoDeFabricacao = anoDeFabricacao;
        this.potenciaDoMotor = potenciaDoMotor;
        this.valorBase = valorBase;
        this.ehImportado = ehImportado;
        this.acessorios = acessorios;
        }

        public String getMarca() {
                return marca;
        }

        public void setMarca(String marca) {
                this.marca = marca;
        }

        public String getModelo() {
                return modelo;
        }

        public void setModelo(String modelo) {
                this.modelo = modelo;
        }

        public int getAnoDeFabricacao() {
                return anoDeFabricacao;
        }

        public void setAnoDeFabricacao(int anoDeFabricacao) {
                this.anoDeFabricacao = anoDeFabricacao;
        }

        public double getPotenciaDoMotor() {
                return potenciaDoMotor;
        }

        public void setPotenciaDoMotor(double potenciaDoMotor) {
                this.potenciaDoMotor = potenciaDoMotor;
        }

        public double getValorBase(){
                return valorBase;
        }

        public void setValorBase(double valorBase){
                this.valorBase = valorBase;
        }

        public boolean isEhImportado() {
                return ehImportado;
        }

        public void setEhImportado(boolean ehImportado) {
                this.ehImportado = ehImportado;
        }

        public Acessorios getAcessorios() {
                return acessorios;
        }

        public void setAcessorios(Acessorios acessorios) {
                this.acessorios = acessorios;
        }

        public double calculaValorTotal(Carro carro){
                return valorBase + ImpostoImportado.calculaImpostoImportado(carro) + ImpostoIPI.calculaImpostoIPI(carro)
                        + acessorios.valorTotalPersonalizacao();
        }
}


