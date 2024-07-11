package org.example.heros;

public class Superman extends Hero{

    public Superman(String name, int powerLevel){
        super(name, powerLevel);
    }

    @Override
    public void usePower(){
        System.out.println(this.name+" usa super força e visão de calor!");
    }
}
