package com.pro1.project;

public class Pokemon {
    private String navn;
    private String lyd;

    public Pokemon (String navn) {
        this.navn = navn;
        this.lyd = navn + navn.substring(navn.length()-3, navn.length());
    }

    public void givLyd () {
        System.out.println(lyd);
    }

}
