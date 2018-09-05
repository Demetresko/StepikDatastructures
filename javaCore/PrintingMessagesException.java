package javaCore;

public class PrintingMessagesException {

    public static void main(String[] args) {
        System.out.println("a");

        mMethod();

        try{
            System.out.println("b");
            throw new IllegalArgumentException();
        }

        catch( IllegalArgumentException e){
            System.out.println("c");
            throw new RuntimeException("1");
        } catch( RuntimeException e)
        {
            System.out.println("d");
        } finally {
            System.out.println("e");
            throw new RuntimeException("229");
        }
    }



    public static void mMethod() throws RuntimeException{ // RuntimeExceptions are optional to handle or declare
    }
}
