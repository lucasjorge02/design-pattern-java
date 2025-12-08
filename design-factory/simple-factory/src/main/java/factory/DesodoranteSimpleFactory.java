package factory;

import model.*;

public class DesodoranteSimpleFactory {
    public static Desodorante aplicarDesodorante(String tipo){
        Desodorante desodorante = null;

        switch (tipo) {
            case "Aerossol":
                desodorante = new DesodoranteAerossol();
                break;
            case "Creme":
                desodorante = new DesodoranteCreme();
                break;
            case "Stick":
                desodorante = new DesodoranteStick();
                break;
            case "Roll-on":
                desodorante = new DesodoranteRollOn();
                break;
        }

        desodorante.modoDeUso();
        desodorante.aplicar();
        desodorante.seloAnvisa();

        return desodorante;
    }
}
