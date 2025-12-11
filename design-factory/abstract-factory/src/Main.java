import factory.MagoEletricoFactory;
import factory.MagoFactory;
import factory.MagoFogoFactory;
import factory.abstractFactory.EletricoAbstractFactory;
import factory.abstractFactory.FogoAbstractFactory;
import factory.abstractFactory.PoderesAbstractFactory;
import model.tropa.Mago;

public class Main {
    public static void main(String[] args) {
        PoderesAbstractFactory eletrico = new EletricoAbstractFactory();
        PoderesAbstractFactory fogo = new FogoAbstractFactory();
        MagoFactory magoEletrico = new MagoEletricoFactory(eletrico);
        MagoFactory magoFogo = new MagoFogoFactory(fogo);

        System.out.println("Criando Um Mago Eletrico");
        Mago mago1 = magoEletrico.orderMago();
        System.out.println(mago1);

        System.out.println("Criando Mago de Fogo");
        Mago mago2 = magoFogo.orderMago();
        System.out.println(mago2);
    }
}
