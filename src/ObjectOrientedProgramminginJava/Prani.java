package ObjectOrientedProgramminginJava;

abstract class Prani {
    public void thinnu(){
        System.out.println("prani oota thinnuthe");
    }

    abstract void Galate();
}

class Nayi extends Prani{
    @Override
    public void Galate(){
        System.out.println("Nayi bogaluthe");
    }

}
class Bekku extends Prani {
    @Override
    public void Galate() {
        System.out.println("bekku koogathee");
    }
}
class Mukhya{
    public static void main(String[] args) {
        Prani n = new Nayi();
        Prani b = new Bekku();

        n.thinnu();
        n.Galate();

        b.thinnu();
        b.Galate();
    }
}


