package factory;

import factory.abstractFactory.PoderesAbstractFactory;
import model.tropa.Mago;
import model.tropa.MagoEletrico;
import model.tropa.MagoFogo;

public class MagoFogoFactory extends MagoFactory {
    public MagoFogoFactory(PoderesAbstractFactory poderes) {
        super(poderes);
    }

    @Override
    protected Mago createMago() {
        return new MagoFogo(poderes);
    }
}
