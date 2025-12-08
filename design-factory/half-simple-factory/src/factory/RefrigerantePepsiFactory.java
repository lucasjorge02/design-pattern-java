package factory;

import model.*;

public class RefrigerantePepsiFactory extends RefrigeranteFactory {
    @Override
    protected Refrigerante criarRefrigerante(String sabor) {
        if(sabor.equals("tradicional")) {
            return new RefrigerantePepsi();
        } else if(sabor.equals("black")) {
            return new RefrigerantePepsiBlack();
        } else return null;
    }
}
