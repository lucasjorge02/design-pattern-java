package factory.abstractFactory;

import model.escudos.Escudo;
import model.escudos.ColunaDeFogo;
import model.poder.BolaFogo;
import model.poder.Poder;

public class FogoAbstractFactory implements PoderesAbstractFactory{

    @Override
    public Escudo gerarEscudo() {
        return new ColunaDeFogo();
    }

    @Override
    public Poder lancarPoder() {
        return new BolaFogo();
    }
}
