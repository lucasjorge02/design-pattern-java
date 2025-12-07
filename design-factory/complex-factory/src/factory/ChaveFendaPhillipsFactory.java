package factory;

import model.Chave;
import model.ChaveFendaPhillips;

public class ChaveFendaPhillipsFactory extends ChaveFactory{
    @Override
    protected Chave criarChave() {
        return new ChaveFendaPhillips();
    }
}
