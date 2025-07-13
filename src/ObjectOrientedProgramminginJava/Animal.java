package ObjectOrientedProgramminginJava;

public class Animal {
    public void walk(){
        System.out.println("animals walk a lot");
    }

}
class Cat extends Animal{
    public void meow(){
        System.out.println("cats meow a lot");
    }
}
class Dog extends Animal{
    public void bark(){
        System.out.println("dogs bark");

    }
}
class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        d.bark();
        d.walk();
        c.meow();
        c.walk();
    }
}

