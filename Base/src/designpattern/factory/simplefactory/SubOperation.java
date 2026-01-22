package designpattern.factory.simplefactory;

public class SubOperation extends Operation{
    @Override
    protected int getResult() {
        return getValue1() - getValue2();
    }
}
