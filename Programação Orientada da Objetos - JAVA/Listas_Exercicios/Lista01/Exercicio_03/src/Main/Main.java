package Main;

import Animal.Cachorro;

public class Main {
    public static void main(String[] args){
        Cachorro cachorro = new Cachorro("AuAu", 8, "Buldog");
        var cachorro2 = new Cachorro("Caramelo", 5, "Vira-Lata");
        var cachorro3 = new Cachorro("Amarelinho", 12, "Salsicha");


        System.out.println(cachorro.toString());
        System.out.println(cachorro2.toString());
        System.out.println(cachorro3.toString());
    }
}
