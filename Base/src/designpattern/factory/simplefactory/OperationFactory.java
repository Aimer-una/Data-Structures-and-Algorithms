package designpattern.factory.simplefactory;
// 简单工厂模式
public class OperationFactory {

    public static Operation createOperation(String operation){
        Operation oper = null;
        switch (operation){
            case "+":
                oper = new AddOperation();
                break;
            case "-":
                oper = new SubOperation();
                break;
        }
        return oper;
    }
    /**
     * 缺点
     * 当我们要新增一种运算的时候就需要新增case这样就修改了OperationFactory不符合开闭原则
     */
}
