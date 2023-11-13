import Animals.Animais;
import Animals.Birds;
import Animals.Cats;
import Animals.Dogs;
import Shop.PetShop;

public class Main {
    public  static  void main(String[] args){

        Dogs dog1 = new Dogs("Nik", "Brown","nada");
        Cats cat1 = new Cats("Spike", "Black", "nada");
        Animais bird1 = new Birds("Loro", "Green", "nada");

        PetShop petShop = new PetShop();

        petShop.banho(bird1);
        petShop.tosar(dog1);
        cat1.soar();
        
        System.out.println(bird1.getSpiritState());
        System.out.println(dog1.getSpiritState());
    }

}