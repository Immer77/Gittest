package com.pro1.project;

import java.util.ArrayList;
import java.util.Random;

public class Pokemon {
    private String navn;
    private ArrayList<String> actions = new ArrayList<>();

    public Pokemon (String navn) {
        this.navn = navn;
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

    public void makeSound () {
        System.out.println(navn + navn.substring(navn.length()-3, navn.length()));
    }

    public void doSomething () {
        Random randomString = new Random();
        System.out.println(actions.get(randomString.nextInt(actions.size())));
    }

}
