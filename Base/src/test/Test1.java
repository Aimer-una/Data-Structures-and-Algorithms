package test;

public interface Test1 {
    default void defaultMethod() {
        System.out.println("This is a default method.");
        staticMethod();
    }
    void haha();

    static void staticMethod() {
        System.out.println("This is a static method in the interface.");
    }

    private void instanceCommonMethod() {
        System.out.println("This is a private instance method used internally.");
    }


}
