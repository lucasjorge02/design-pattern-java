package factory;

import factory.abstractFactory.PoderesAbstractFactory;
import model.tropa.Mago;

public abstract class MagoFactory {
    PoderesAbstractFactory poderes;

    public MagoFactory(PoderesAbstractFactory poderes){
        this.poderes = poderes;
    }

    public Mago orderMago(){
        Mago mago = null;

        mago = createMago();

        mago.getLore();
        mago.canalizarMagia();
        mago.recitarFeitico();

        return mago;
    }

    protected abstract Mago createMago();
}
