package factory.abstractFactory;

import model.escudos.Escudo;
import model.poder.Poder;

public interface PoderesAbstractFactory {
    Escudo gerarEscudo();
    Poder lancarPoder();
}
