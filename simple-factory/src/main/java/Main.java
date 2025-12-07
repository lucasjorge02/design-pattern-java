import factory.DesodoranteSimpleFactory;
import model.Desodorante;

public class Main {
    public static void main(String[] args) {
        System.out.println("Aplicando um Desodorante Aerossol");
        Desodorante desodorante = DesodoranteSimpleFactory.aplicarDesodorante("Aerossol");
        System.out.println(desodorante);
    }
}
