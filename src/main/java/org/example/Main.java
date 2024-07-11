package org.example;

import org.example.heros.Batman;
import org.example.heros.Hero;
import org.example.heros.Superman;
import org.example.heros.WonderWoman;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Criação de objetos das subclasses
        Hero superman = new Superman("Superman", 100);
        Hero batman = new Batman("Batman", 85);
        Hero wonderWoman = new WonderWoman("Wonder Woman", 90);

        //Exibindo informações dos poderes
        System.out.println(superman.getName()+" tem nível de poder "+superman.getPowerLevel());
        superman.usePower();

        //Modificando nível de poder
        superman.setPowerLevel(120);
        System.out.println(superman.getName()+" tem novo nível de poder "+superman.getPowerLevel());

        //Adicionando os heróis à lista
        ArrayList<Hero> heroes = new ArrayList<>();
        heroes.add(superman);
        heroes.add(batman);
        heroes.add(wonderWoman);

        //Percorrendo a lista e chamando o método usePower()
        for (Hero hero: heroes){
            System.out.println(hero.getName()+" tem nível de poder "+hero.getPowerLevel());
            hero.usePower();
        }

    }
}