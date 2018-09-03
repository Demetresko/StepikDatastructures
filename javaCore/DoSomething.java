package javaCore;

public class DoSomething {

    public void go(){
        System.out.println("A");
        try{
            stop();
        } catch (ArithmeticException e){ // The output is AEC because Method go() doesnt  handle NullPointerException
            System.out.println("B");
        } finally {
            System.out.println("C");
        }
    }

    private void stop() {
        System.out.println("E");
        Object x = null;
        x.toString();
        System.out.println("F");
    }

    public static void main(String[] args) {
        new DoSomething().go(); // The output is AEC because Method go() doesnt  handle NullPointerException
    }

}
