package ObjectOrientedProgramminginJava;

 class Methodoverring {
    public void sound() {
        System.out.println("animals make sound");

    }

}
class Monkey extends Methodoverring
{
    public void sound(){
        super.sound();
    }

}
    class Dogy extends Methodoverring {
        @Override
        public void sound() {
            System.out.println("dogs bark a lot");

        }


        public static void main(String[] args) {
            Methodoverring d = new Dogy();
            d.sound();
        }


    }

