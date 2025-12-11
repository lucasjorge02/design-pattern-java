package factory;

import factory.abstractFactory.PoderesAbstractFactory;
import model.tropa.Mago;
import model.tropa.MagoEletrico;

public class MagoEletricoFactory extends MagoFactory{
    public MagoEletricoFactory(PoderesAbstractFactory poderes) {
        super(poderes);
    }

    @Override
    protected Mago createMago() {
        return new MagoEletrico(poderes);
    }

}
