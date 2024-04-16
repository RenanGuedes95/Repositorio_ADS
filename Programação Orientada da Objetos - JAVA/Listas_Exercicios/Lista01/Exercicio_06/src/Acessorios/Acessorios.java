package Acessorios;

import Veiculos.Carro;

public class Acessorios {
    boolean cambioAutomatico;
    boolean vidroAutomatico;
    boolean alarme;
    boolean tetoSolar;
    boolean kitMultimidia;
    boolean arCondicionado;
    boolean pinturaPersonalizada;

    public Acessorios(){

    }
    public Acessorios(boolean cambioAutomatico, boolean vidroAutomatico, boolean alarme, boolean tetoSolar, boolean kitMultimidia, boolean arCondicionado, boolean pinturaPersonalizada) {
        this.cambioAutomatico = cambioAutomatico;
        this.vidroAutomatico = vidroAutomatico;
        this.alarme = alarme;
        this.tetoSolar = tetoSolar;
        this.kitMultimidia = kitMultimidia;
        this.arCondicionado = arCondicionado;
        this.pinturaPersonalizada = pinturaPersonalizada;
    }

    public boolean isCambioAutomatico() {
        return cambioAutomatico;
    }

    public void setCambioAutomatico(boolean cambioAutomatico){
        this.cambioAutomatico = cambioAutomatico;
    }
    public boolean isVidroAutomatico() {
        return vidroAutomatico;
    }

    public boolean isAlarme() {
        return alarme;
    }

    public boolean isTetoSolar() {
        return tetoSolar;
    }

    public boolean isKitMultimidia() {
        return kitMultimidia;
    }

    public boolean isArCondicionado() {
        return arCondicionado;
    }

    public boolean isPinturaPersonalizada() {
        return pinturaPersonalizada;
    }

    public double addCambioAutomatico(){
        return (cambioAutomatico) ? 5000 : 0;
    }
    public double addvidroAutomatico(){
        return (vidroAutomatico) ? 1000 : 0;
    }
    public double addAlarme(){
        return (alarme) ? 800 : 0;
    }
    public double addTetoSolar(){
        return (tetoSolar) ? 4000 : 0;
    }
    public double addKitMultimidia(){
        return (kitMultimidia) ? 1800 : 0;
    }
    public double addArCondicionado(){
        return (arCondicionado) ? 3000 : 0;
    }
    public double addPinturaEspecial(){
        return (pinturaPersonalizada) ? 2500 : 0;
    }

    public double valorTotalPersonalizacao(){
        return addCambioAutomatico() + addvidroAutomatico() + addAlarme() + addTetoSolar() + addKitMultimidia() +
                addArCondicionado() + addPinturaEspecial();
    }

    @Override
    public String toString(){
        return "\nInformações da personalização:" +
                "\nCambio automático ? " + isCambioAutomatico() +
                "\nVidro automático ? " + isVidroAutomatico() +
                "\nAlarme ? " + isAlarme() +
                "\nTeto Solar ? " + isTetoSolar() +
                "\nKit Multimidia ? " + isKitMultimidia() +
                "\nAr condicionado ? " + isArCondicionado() +
                "\nPintura Espcial ? " + isPinturaPersonalizada();
    }

}
