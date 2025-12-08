package model;



public abstract class Refrigerante {

    public abstract void beber();

    public void abrir(){
        System.out.println("O refrigerante agora está aberta!");;
    }

    public void servirUmCopo(){
        System.out.println("Um copo de refrigerante foi servido!");
    }

}
