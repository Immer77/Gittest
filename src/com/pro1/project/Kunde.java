package com.pro1.project;

public class Kunde {
    String name;
    int alder;

    public Kunde(String name, int alder){
        this.name = name;
        this.alder = alder;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }

    public int getAlder() {
        return alder;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName() + " " + getAlder();
    }
}
