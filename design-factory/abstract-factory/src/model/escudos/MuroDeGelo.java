package model.escudos;

public class MuroDeGelo implements Escudo {
    @Override
    public String bloquearAtaque() {
        return "Você fez uma uma barreira espessa de gelo a sua frente!";
    }
}
