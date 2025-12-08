import factory.RefrigeranteConvencaoFactory;
import factory.RefrigeranteFactory;
import factory.RefrigerantePepsiFactory;
import model.Refrigerante;

public class Main {
    public static void main(String[] args) {
        RefrigeranteFactory pepsiFactory = new RefrigerantePepsiFactory();
        RefrigeranteFactory convencaoFactory = new RefrigeranteConvencaoFactory();

        System.out.println("### Pedindo uma Pepsi");
        Refrigerante refri1 = pepsiFactory.pedirRefrigerante("tradicional");
        System.out.println(refri1);

        System.out.println("### Pedindo uma Convecao Frutaina");
        Refrigerante refri2 = convencaoFactory.pedirRefrigerante("frutaina");
        System.out.println(refri2);
    }
}