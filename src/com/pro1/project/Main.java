package com.pro1.project;

import opgave5.DivideAndConquer;
import opgave5.Iteration;
import opgave5.Recursive;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
/*        System.out.println("Hello World");

        Pokemon oddish = new Pokemon("Oddish");
        oddish.makeSound();
        oddish.doSomething();


        Person person = new Person();
        System.out.println("ANujan ændrede");
        System.out.println(person.getNavn() + " " + person.getHvadPersonHarGlemt());

        System.out.println("Prut");

        Kunde k1 = new Kunde("Anujan ",22);
        System.out.println(k1);
        k1.setAlder(200);
        System.out.println(k1.getAlder());
        System.out.println(k1.getName());
        k1.setName("Noob");

        System.out.println("Peters branch created");*/


        //Julius Test starter her {”Jan Jensen”, ”Jens Hansen”, ”Leo Hansen”, ”Jens Jensen”, ”Jensine Larsen”}.

        ArrayList<String> liste = new ArrayList<>();
        liste.add("Jan Jensen");
        liste.add("Jens Hansen");
        liste.add("Leo Hansen");
        liste.add("Jens Jensen");
        liste.add("Jensine Larsen");

        System.out.println(Iteration.countDelStreng(liste,"Jens"));
        System.out.println(Recursive.countDelStreng(liste,"Jens"));
        System.out.println(DivideAndConquer.countDelStreng(liste,"Jens"));

    }
}
