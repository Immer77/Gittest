package com.pro1.project;

public class Pokemon {
    private String navn;
    private String lyd;

    public Pokemon (String navn) {
        this.navn = navn;
        this.lyd = navn + "ah";
    }

    public void givLyd () {
        System.out.println(lyd);
    }

}
