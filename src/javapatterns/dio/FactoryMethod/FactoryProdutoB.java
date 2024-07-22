package javapatterns.dio.FactoryMethod;

public class FactoryProdutoB implements Factory{
    @Override
    public Produto criarProduto() {
        return new ProdutoB();
    }
}
