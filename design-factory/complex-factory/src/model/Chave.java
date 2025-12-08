package model;

public abstract class Chave {

    public abstract void usar();

    public void tamanhos(){
        System.out.println("Existem variados tamanhos de chaves para encaixar em diferentes parafusos");
    }

    public void verificarCabo(){
        System.out.println("O cabo da chave está em ótima condição!");
    }
}
