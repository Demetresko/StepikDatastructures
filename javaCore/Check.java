package javaCore;

import stepik.Longer;

class Bird{
    protected void fly(){
        System.out.println("Bird is flying");
    }

    protected Object eat(int food){
        System.out.println("Bird " + food +" units  of food");
        return 10;
    }


}


   abstract final class  Eagle { // Illegal combination of modifiers

    private abstract void fly(){
        return ;
    }


    protected  String eat(int food){
        return "";
    }

   }