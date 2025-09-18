package designpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 生成器模式
 */
public class Builder {
    public static void main(String[] args) {
        BuilderTest builder1 = new Builder1();
        Director director = new Director();
        director.construct(builder1);
        BuilderProduct result = builder1.getResult();
        result.show();
    }
}

class Director{
    public void construct(BuilderTest builderTest){
        builderTest.BuilderPart();
    }
}

abstract class BuilderTest{
    public abstract void BuilderPart();
    public abstract BuilderProduct getResult();
}

class Builder1 extends BuilderTest{
    BuilderProduct product = new BuilderProduct();

    @Override
    public void BuilderPart() {
        product.add("A");
        product.add("B");
        product.add("C");
        product.add("D");
        product.add("E");
    }

    @Override
    public BuilderProduct getResult() {
        return product;
    }
}

class Builder2 extends BuilderTest{
    BuilderProduct product = new BuilderProduct();

    @Override
    public void BuilderPart() {
        product.add("A");
        product.add("B");
    }

    @Override
    public BuilderProduct getResult() {
        return product;
    }
}

class BuilderProduct{
    List<String> parts = new ArrayList<>();
    public void add(String part){
        parts.add(part);
    }

    public void show(){
        for (String part : parts) {
            System.out.print(part+ " ");

        }
    }
}
