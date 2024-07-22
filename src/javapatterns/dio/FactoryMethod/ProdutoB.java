package javapatterns.dio.FactoryMethod;

public class ProdutoB implements Produto{
    @Override
    public void criar() {
        System.out.println("Produto B criado");
    }
}
