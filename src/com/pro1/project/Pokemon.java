package com.pro1.project;

import java.util.ArrayList;
import java.util.Random;

/**
 * Modulerer en pokemon, som kan sige lyde og gøre ting
 */
public class Pokemon {
    private String navn;
    private ArrayList<String> actions = new ArrayList<>();

    /**
     * Skaber en ny Pokemon
     * @param navn Det navn din pokemon skal have
     */
    public Pokemon (String navn) {
        this.navn = navn;

        //Opretter forskellige handlinger pokemonen kan gøre
        actions.add("**Snuggles closer**");
        actions.add("**Farts loudly**");
        actions.add("**Runs away**");
        actions.add("**Spits in your eye**");
        actions.add("**Murders your father**");
        actions.add("**Jumps up and down**");
        actions.add("**Eats something**");
        actions.add("**Drinks blood**");
        actions.add("**Exhales creepily**");
        actions.add("**Bangs your mom**");
    }


    /**
     * Får din pokemon til at sige en lyd
     */
    public void makeSound () {
        System.out.println(navn + navn.substring(navn.length()-3, navn.length()));
    }

    /**
     * Får din pokemon til at gøre noget
     */
    public void doSomething () {
        Random randomString = new Random();
        System.out.println(actions.get(randomString.nextInt(actions.size())));
    }

}
