import Animals.Birds;
import Animals.Cats;
import Animals.Dogs;

public class Main {
    public  static  void main(String[] args){

        Dogs dog1 = new Dogs("Nik", "Brown","nada");
        Cats cat1 = new Cats("Spike", "Black", "nada");
        Birds bird1 = new Birds("Loro", "Green", "nada");


        dog1.soar();
        cat1.soar();
        bird1.soar();
    }

}