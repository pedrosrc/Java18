package Animals;

public class Cats extends Animais {
    //Atributos
    static  int numberCats;

    public Cats(String name, String color, String spiritState) {
        super(name, color, spiritState);
    }

    @Override
    public String toString() {
        return "Cats{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("Miau");
    }
}
