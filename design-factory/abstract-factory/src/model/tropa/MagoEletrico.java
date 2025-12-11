package model.tropa;

import factory.abstractFactory.PoderesAbstractFactory;

public class MagoEletrico extends Mago {

    public MagoEletrico(PoderesAbstractFactory elementos) {
        super(elementos);
    }

    @Override
    public void getLore() {
        System.out.println("""
                O mago eletrico é rápido, consegue disparar rajadas eletricas mortais
                Diferente dos outros magos ele precisa de mais tempo para usar suas
                habilidades, pois a grande carga de energia afeta seu corpo!
                """);
        System.out.println(elementos.gerarEscudo().bloquearAtaque());
        System.out.println( elementos.lancarPoder().usarNoAlvo());
    }
}
