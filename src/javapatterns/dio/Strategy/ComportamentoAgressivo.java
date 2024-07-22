package javapatterns.dio.Strategy;

public class ComportamentoAgressivo implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Movendo agressivamente");
    }
}
