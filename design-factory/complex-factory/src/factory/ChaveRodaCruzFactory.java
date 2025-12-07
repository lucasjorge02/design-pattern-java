package factory;

import model.Chave;
import model.ChaveRodaCruz;

public class ChaveRodaCruzFactory extends ChaveFactory {
    @Override
    protected Chave criarChave() {
        return new ChaveRodaCruz();
    }
}
