package model.tropa;

import factory.abstractFactory.PoderesAbstractFactory;

public class MagoFogo extends Mago{
    public MagoFogo(PoderesAbstractFactory elementos) {
        super(elementos);
    }

    @Override
    public void getLore() {
        System.out.println("""
                O mago de fogo é agil e ofensivo, consegue disparar bolas de fogo mortais,
                consegue abater multiplas tropas com seu dano em area. Ele aplica dano de
                queimação as tropas que sobreviverem aos seus ataques. (Exceto tropas de fogo)
                """);
        System.out.println(elementos.gerarEscudo().bloquearAtaque());
        System.out.println( elementos.lancarPoder().usarNoAlvo());
    }
}
