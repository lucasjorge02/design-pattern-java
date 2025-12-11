package factory;

import factory.abstractFactory.PoderesAbstractFactory;
import model.tropa.Mago;
import model.tropa.MagoGelo;

public class MagoGeloFactory extends MagoFactory{
    public MagoGeloFactory(PoderesAbstractFactory poderes) {
        super(poderes);
    }

    @Override
    protected Mago createMago() {
        return new MagoGelo(poderes);
    }
}
