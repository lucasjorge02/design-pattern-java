package factory;

import model.Chave;
import model.ChaveFendaTorx;

public class ChaveFendaTorxFactory extends ChaveFactory{
    @Override
    protected Chave criarChave() {
        return new ChaveFendaTorx();
    }
}
