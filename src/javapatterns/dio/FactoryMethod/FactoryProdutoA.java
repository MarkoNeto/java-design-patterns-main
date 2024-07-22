package javapatterns.dio.FactoryMethod;

public class FactoryProdutoA implements Factory{
    @Override
    public Produto criarProduto() {
        return new ProdutoA();
    }
}
