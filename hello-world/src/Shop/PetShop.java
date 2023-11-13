package Shop;

import Animals.Animais;
import Animals.Dogs;

public class PetShop {

    public void banho(Animais animais){animais.setSpiritState("Limpo");}
    public  void tosar(Dogs dogs){dogs.setSpiritState("tosado");}
    public void deixadoNoPetshop(Animais animais){animais.setSpiritState("Saudade");}



}
