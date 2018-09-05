package javaCore;

import java.io.EOFException;
import java.io.IOException;

class App {
    // ТЕПЕРЬ пугаем Throwable
    public static void main(String[] args) throws Throwable {
        try {
            Throwable t = new IOException(); // а лететь будет Exception
            throw t;
        } catch (IOException e) { // и мы перехватим Exception
            System.out.println("Перехвачено!");
        }
    }
}


