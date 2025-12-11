package factory.abstractFactory;

import model.escudos.Escudo;
import model.escudos.MuroDeGelo;
import model.poder.FragmentosNeve;
import model.poder.Poder;

public class GeloAbstractFactory implements PoderesAbstractFactory{
    @Override
    public Escudo gerarEscudo() {
        return new MuroDeGelo();
    }

    @Override
    public Poder lancarPoder() {
        return new FragmentosNeve();
    }
}
