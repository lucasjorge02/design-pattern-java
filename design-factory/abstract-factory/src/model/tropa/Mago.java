package model.tropa;

import factory.abstractFactory.PoderesAbstractFactory;

public abstract class Mago {

    PoderesAbstractFactory elementos;

    public Mago(PoderesAbstractFactory elementos){
        this.elementos = elementos;
    }

    public abstract void getLore();

    public void canalizarMagia(){
        System.out.println("Canalizando magia, a mana ao redor dele se agita!");
    }

    public void recitarFeitico(){
        System.out.println("O Mago está murmurando algo em uma língua antiga!");
    }
}