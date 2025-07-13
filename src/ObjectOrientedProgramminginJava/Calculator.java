package ObjectOrientedProgramminginJava;

public class Calculator {
    public int add(int a , int b){
        return a+b;
    }
    public double add(double a, double b ,double c){
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(10,3,4)) ;
    }
}
