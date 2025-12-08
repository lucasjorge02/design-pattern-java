package model;

public class DesodoranteCreme extends Desodorante{

    @Override
    public void aplicar() {
        System.out.println("Removendo tampa do creme");
        System.out.println("Pegando um pouco do produto com as mãos");
        System.out.println("Aplicando creme na região das axilas!");
    }
}
