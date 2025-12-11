package model.escudos;

public class BarreiraEletrica implements Escudo{
    @Override
    public String bloquearAtaque() {
        return "Você fez uma compacta barreira eletrica ao seu redor!";
    }
}
