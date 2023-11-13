package Animals;

public abstract class Animais {
    // Atributos
    protected String name;
    protected String color;
    protected int height;
    protected double peso;
    protected String spiritState;
    //Constructor
    public Animais(String name, String color, String spiritState) {
        this.name = name;
        this.color = color;
        this.spiritState = spiritState;
    }
    // Metodos
    protected void comer(){}
    protected void dormir(){}
    public abstract void soar();
    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getSpiritState() {
        return spiritState;
    }

    public void setSpiritState(String spiritState) {
        this.spiritState = spiritState;
    }
}
