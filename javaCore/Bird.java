package javaCore;

 public abstract class Bird {
      private void fly() {   // Hidden method are invoked by a reference type, not an object itself

          System.out.println(" Bird is flying");
      }

     public static void main(String[] args) {
         Bird bird = new Pelican();
         bird.fly(); // invokes hidden method in parent class


         Pelican pelican = (Pelican) bird;
         pelican.fly();  // invokes overriden method in child class
     }
 }

 class Pelican extends Bird{
     protected void fly(){
         System.out.println(" Pelican is flying");
     }
 }
