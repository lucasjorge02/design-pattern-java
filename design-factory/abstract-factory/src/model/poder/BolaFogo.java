package model.poder;

public class BolaFogo implements Poder{
    @Override
    public String usarNoAlvo() {
        return "Você lançou uma bola de fogo no alvo! Tudo está em chamas!";
    }
}
