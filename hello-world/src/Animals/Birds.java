package Animals;

public class Birds extends Animais {
    static  int numberBirds;

    public Birds(String name, String color, String spiritState) {
        super(name, color, spiritState);
    }

    @Override
    public String toString() {
        return "Birds{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("Piu Piu");
    }
}
