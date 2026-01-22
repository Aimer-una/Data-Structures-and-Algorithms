package designpattern.factory.simplefactory;

public class AddOperation extends Operation{
    @Override
    protected int getResult() {
        return getValue1() + getValue2();
    }
}
