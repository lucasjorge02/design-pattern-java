package model.poder;

public class RaioEletrico implements Poder{
    @Override
    public String usarNoAlvo() {
        return "Você lançou uma rajada de raio eletrico! Todos os oponentes estão em choque!";
    }
}
