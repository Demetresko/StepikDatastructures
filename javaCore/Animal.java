package javaCore;


class Arthopod {
    protected  int variable = 9;
 public void print(double input){
     System.out.println(" Arthropod");
 }
}

class Spider extends Arthopod{  /* Method overloading in inheritance
                                   and instance variables of the parent
                                   can be inherited by a child,
                                   static can not
    */
    public void print(int input){
        System.out.println("Spider");
    }

    public static void main(String[] args) {
        Spider spider = new Spider();
        spider.print(4);
        spider.print(9.0);
        System.out.println( spider.variable);
    }
}




