package model;

public abstract class Desodorante {
    public abstract void aplicar();

    public void modoDeUso(){
        System.out.println("Utilizar nas axilas,evitar região sensíveis e/ou lesionadas!");
    }

    public void seloAnvisa() {
        System.out.println("Produto certificado e aprovado pela Anvisa");
    }
}
