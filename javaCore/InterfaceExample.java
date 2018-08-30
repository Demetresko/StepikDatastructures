package javaCore;

interface Walk{
    public  default int getSpeed(){
        return 5;
    }
}

interface Run {
    public default int getSpeed(){
        return 10;
    }
}


 class Cat implements Run,Walk{ // INHERITS UNRELATED DEFAULTS FOR...

     public static void main(String[] args) {
         System.out.println( new Cat().getSpeed());
     }
}