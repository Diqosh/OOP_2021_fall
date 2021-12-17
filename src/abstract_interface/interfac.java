package abstract_interface;

interface DogInterface {
    void bark();

    void poop();
}

class Dogy implements DogInterface{
    @Override
    public void bark(){
        System.out.println("brrr");
    }
    @Override
    public void poop(){
        System.out.println("mewww");
    }
}



public class interfac {
    public static void main(String[] args) {
        Dogy d = new Dogy();
        d.bark();
    }


}
