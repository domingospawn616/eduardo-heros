package org.example.heros;

public class Batman extends Hero{

    public Batman(String name, int powerLevel){
        super(name, powerLevel);
    }

    @Override
    public void usePower() {
        System.out.println(this.name+" usa gadgets e habilidades de combate");
    }
}
