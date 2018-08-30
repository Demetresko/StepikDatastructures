package javaCore;

public abstract   interface InterfaceExample {
    public static final int ANOTHER_CONSTANT = 0;
    abstract int Method();
}

interface AnotherInterface {
    boolean Second();
}

abstract class AbstractClass implements InterfaceExample, AnotherInterface{

}




class Check extends AbstractClass{  // Compile error must implement methos from AbstractClass ( inherited form both interfaces)
    public static void main(String[] args) {
        System.out.println( ANOTHER_CONSTANT+ " This compiler definitely " +
                               " knows something about life");
    }


}

