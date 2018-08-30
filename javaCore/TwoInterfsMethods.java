package javaCore;

interface Omnivore{
    void eat();
}

interface Herbivore {
    int eat();
}

public class TwoInterfsMethods implements Herbivore,Omnivore{


    @Override
    public void eat() {  // Clashes with another interface
        return 0;
    }
}
