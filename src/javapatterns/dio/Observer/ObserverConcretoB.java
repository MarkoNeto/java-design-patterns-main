package javapatterns.dio.Observer;

public class ObserverConcretoB implements Observer{
    @Override
    public void notificar(String mensagem) {
        System.out.println("Observador B recebeu a mensagem: " + mensagem);
    }
}
