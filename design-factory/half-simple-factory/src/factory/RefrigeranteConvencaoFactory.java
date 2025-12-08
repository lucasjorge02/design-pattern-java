package factory;

import model.*;

public class RefrigeranteConvencaoFactory extends RefrigeranteFactory{
    @Override
    protected Refrigerante criarRefrigerante(String sabor) {
        if(sabor.equals("tradicional")) {
            return new RefrigeranteConvencao();
        } else if(sabor.equals("frutaina")) {
            return new RefrigeranteConvencaoFrutaina();
        } else return null;
    }
}
