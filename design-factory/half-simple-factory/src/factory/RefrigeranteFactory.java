package factory;

import model.Refrigerante;

import java.sql.Ref;

public abstract class RefrigeranteFactory {

    public Refrigerante pedirRefrigerante(String sabor){
        Refrigerante refrigerante = null;

        refrigerante = criarRefrigerante(sabor);

        refrigerante.abrir();
        refrigerante.servirUmCopo();
        refrigerante.beber();

        return refrigerante;
    }
    protected abstract Refrigerante criarRefrigerante(String sabor);
}
