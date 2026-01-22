package designpattern.factory.simplefactory;

public class App {
    public static void main(String[] args) {
        Operation operationAdd = OperationFactory.createOperation("+");
        operationAdd.setValue1(2);
        operationAdd.setValue2(3);
        System.out.println(operationAdd.getResult());
    }
    
}
