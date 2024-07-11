package org.example.heros;

public class WonderWoman extends Hero{

    public WonderWoman(String name, int powerLevel){
        super(name, powerLevel);
    }

    @Override
    public void usePower() {
        System.out.println(this.name+" usa laço de verdade e super força");
    }
}
