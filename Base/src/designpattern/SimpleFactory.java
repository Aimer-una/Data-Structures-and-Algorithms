package designpattern;

/**
 * 简单工厂模式
 */
public class SimpleFactory {
    public static void main(String[] args) {
        Factory factoryA = new FactoryA();
        Product productA = factoryA.createProduct();
        productA.info();
        System.out.println("==========================");
        Factory factoryB = new FactoryB();
        Product productB = factoryB.createProduct();
        productB.info();
    }
}

interface Factory {
    Product createProduct();

}

class FactoryA implements Factory{
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}

class FactoryB implements Factory{
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}

interface Product{
    public abstract void info();
}

class ProductA implements Product{
    @Override
    public void info() {
        System.out.println("产品A的信息");
    }
}

class ProductB implements Product{
    @Override
    public void info() {
        System.out.println("产品B的信息");
    }
}
