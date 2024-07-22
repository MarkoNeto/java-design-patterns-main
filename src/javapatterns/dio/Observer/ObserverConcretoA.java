package javapatterns.dio.Observer;

public class ObserverConcretoA implements Observer{
    @Override
    public void notificar(String mensagem) {
        System.out.println("Observador A recebeu a mensagem: " + mensagem);
    }
}
