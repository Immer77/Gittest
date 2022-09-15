package com.pro1.project;

public class Person {
    String navn;
    String hvadPersonHarGlemt;

    public Person(){
        this.navn = "Peter";
        this.hvadPersonHarGlemt = "glemte at tilføje person klassen til repo";
    }

    public String getNavn() {
        return navn;
    }

    public String getHvadPersonHarGlemt() {
        return hvadPersonHarGlemt;
    }
}
