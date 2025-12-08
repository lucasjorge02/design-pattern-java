import factory.ChaveFactory;
import factory.ChaveFendaTorxFactory;
import factory.ChaveRodaCruzFactory;
import model.Chave;

public class Main {
    public static void main(String[] args) {
        ChaveFactory chaveTorxFactory = new ChaveFendaTorxFactory();
        ChaveFactory chaveCruzFactory = new ChaveRodaCruzFactory();

        System.out.println("Criando uma Chave de Fenda Torx!");
        Chave chave1 = chaveTorxFactory.pedirChave();
        System.out.println(chave1);

        System.out.println("Criando uma Chave de Roda Cruz!");
        Chave chave2 = chaveCruzFactory.pedirChave();
        System.out.println(chave2);
    }
}
