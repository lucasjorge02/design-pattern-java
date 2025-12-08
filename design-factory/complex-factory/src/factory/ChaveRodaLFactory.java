package factory;

import model.Chave;
import model.ChaveRodaL;

public class ChaveRodaLFactory extends ChaveFactory{
    @Override
    protected Chave criarChave() {
        return new ChaveRodaL();
    }
}
