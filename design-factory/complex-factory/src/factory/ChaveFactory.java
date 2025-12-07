package factory;

import model.Chave;

public abstract class ChaveFactory {
    public Chave pedirChave() {
        Chave chave = null;

        chave = criarChave();

        chave.tamanhos();
        chave.verificarCabo();
        chave.usar();

        return chave;
    }

    protected abstract Chave criarChave();
}
