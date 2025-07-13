package ObjectOrientedProgramminginJava;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

abstract class Animals {
    public void eat(){
        System.out.println("Animals eat food");

    }
    abstract void sound();
}
class Doggy extends Animals {
    @Override
            public void sound() {
        System.out.println("The dog barks");
    }


}
 class Meow extends Animals {
     @Override
     void sound() {
         System.out.println("the cat meows");
     }
 }
 class Maint{
     public static void main(String[] args) {
         Animals d = new Doggy();
         Animals c = new Meow();
         d.sound();
         c.sound();
         d.eat();
         c.eat();
     }
 }


