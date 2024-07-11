package org.example.heros;

abstract public class Hero {
    protected String name;
    protected int powerLevel;

    public Hero(String name, int powerLevel){
        this.name = name;
        this.powerLevel = powerLevel;
    }

    public String getName(){
        return this.name;
    }

    public int getPowerLevel(){
        return this.powerLevel;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    //Método abstrato que será implementado pelas subclasses
    public abstract void usePower();
}
