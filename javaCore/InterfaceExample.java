package javaCore;

public abstract   interface InterfaceExample {
    public static final int ANOTHER_CONSTANT = 0;




    abstract int Method();
}


class Check implements InterfaceExample{
    public static void main(String[] args) {
        System.out.println( ANOTHER_CONSTANT+ " This compiler definitely " +
                               " knows something about life");
    }

    @Override
    public int Method() {
        return  129;
    }
}

