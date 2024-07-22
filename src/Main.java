import javapatterns.dio.FactoryMethod.Factory;
import javapatterns.dio.FactoryMethod.FactoryProdutoA;
import javapatterns.dio.FactoryMethod.FactoryProdutoB;
import javapatterns.dio.FactoryMethod.Produto;
import javapatterns.dio.Observer.Observer;
import javapatterns.dio.Observer.ObserverConcretoA;
import javapatterns.dio.Observer.ObserverConcretoB;
import javapatterns.dio.Observer.Sujeito;
import javapatterns.dio.Singleton.SingletonEager;
import javapatterns.dio.Singleton.SingletonLazy;
import javapatterns.dio.Singleton.SingletonLazyHolder;
import javapatterns.dio.Strategy.*;
import javapatterns.dio.Facade.Facade;

public class Main {
    public static void main(String[] args) {

        //Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        //Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();
        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();

        //Facade

        Facade facade = new Facade();
        facade.migrarCliente("Rafael", "12345678");

        //FactoryMethod

        Factory factoryA = new FactoryProdutoA();
        Produto produtoA = factoryA.criarProduto();
        produtoA.criar();

        Factory factoryB = new FactoryProdutoB();
        Produto produtoB = factoryB.criarProduto();
        produtoB.criar();


        //Observer
        Sujeito sujeito = new Sujeito();

        // Crie instâncias dos observadores
        Observer observadorA = new ObserverConcretoA();
        Observer observadorB = new ObserverConcretoB();

        // Registre os observadores no sujeito
        sujeito.adicionarObservador(observadorA);
        sujeito.adicionarObservador(observadorB);

        // Notifique os observadores com uma mensagem
        sujeito.notificarObservadores("Uma mensagem importante foi recebida!");

        // Remova um observador (opcional)
        sujeito.removerObservador(observadorA);

        // Notifique novamente após remover o observador
        sujeito.notificarObservadores("Outra mensagem importante foi recebida!");


    }
}