package javapatterns.dio.Observer;

import java.util.ArrayList;
import java.util.List;

public class Sujeito {
    private List<Observer> observadores = new ArrayList<>();

    public void adicionarObservador(Observer observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observer observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores(String mensagem) {
        for (Observer observador : observadores) {
            observador.notificar(mensagem);
        }
    }
}
