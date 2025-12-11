package factory.abstractFactory;

import model.escudos.BarreiraEletrica;
import model.escudos.Escudo;
import model.poder.Poder;
import model.poder.RaioEletrico;

public class EletricoAbstractFactory implements PoderesAbstractFactory {
    @Override
    public Escudo gerarEscudo() {
        return new BarreiraEletrica();
    }

    @Override
    public Poder lancarPoder() {
        return new RaioEletrico();
    }
}
