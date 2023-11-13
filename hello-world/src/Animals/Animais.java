package Animals;

public class Animais {

    protected String name;
    protected String color;
    protected int height;
    protected double peso;
    protected String spiritState;

    public Animais(String name, String color, String spiritState) {
        this.name = name;
        this.color = color;
        this.spiritState = spiritState;
    }

    protected void comer(){}
    protected void dormir(){}
    public void soar(){
        System.out.println("Cri Cri");
    }
}
