package com.pro1.project;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");

        Pokemon oddish = new Pokemon("Oddish");
        oddish.givLyd();


        Person person = new Person();
        System.out.println("ANujan ændrede");
        System.out.println(person.getNavn() + " " + person.getHvadPersonHarGlemt());

        System.out.println("Prut");

        oddish.givLyd();

        Kunde k1 = new Kunde("Anujan ",22);
        System.out.println(k1);
        k1.setName("Noob");
    }
}
