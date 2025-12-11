package model.tropa;

import factory.abstractFactory.PoderesAbstractFactory;

public class MagoGelo extends Mago {
    public MagoGelo(PoderesAbstractFactory elementos) {
        super(elementos);
    }

    @Override
    public void getLore() {
        System.out.println("""
                O mago de gelo é lento e muito fragil, consegue disparar fragmentos
                congelantes em area. Ele é lento, porem seu poder escala a cada golpe,
                tendo a possibilidade de congelar por completo as tropas inimigas.
                """);
        System.out.println(elementos.gerarEscudo().bloquearAtaque());
        System.out.println( elementos.lancarPoder().usarNoAlvo());
    }
}
