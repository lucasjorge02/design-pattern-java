import factory.DesodoranteSimpleFactory;
import model.Desodorante;

public class Main {
    public static void main(String[] args) {
        System.out.println("Aplicando um Desodorante Aerossol");
        Desodorante desodorante1 = DesodoranteSimpleFactory.aplicarDesodorante("Aerossol");
        System.out.println(desodorante1);

        System.out.println("Aplicando um Desodorante Creme");
        Desodorante desodorante2 = DesodoranteSimpleFactory.aplicarDesodorante("Creme");
        System.out.println(desodorante2);
    }
}
