package Animals;

public class Dogs extends Animais {
    //ATRIBUTOS
    static  int numberDogs;

    //CONSTRUTORES

    public Dogs(String name, String color, String spiritState) {
        super(name, color, spiritState);
    }


    //METODOS

    public static int getNumberDogs() {
        return numberDogs;
    }
    public static void setNumberDogs(int numberDogs) {
        Dogs.numberDogs = numberDogs;
    }
    public String getName(){return this.name;}
    public void setName(String name) {this.name = name;}
    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}
    public int getHeight() {return height;}
    public void setHeight(int height) {this.height = height;}
    public double getPeso() {return peso;}
    public void setPeso(double peso) {this.peso = peso;}
    public String getSpiritState() {return spiritState;}
    public void setSpiritState(String spiritState) {this.spiritState = spiritState;}


    public String interagir(String action) {

        switch(action){
            case "carinho": this.spiritState= "Happy"; break;
            case "nada": this.spiritState= "Sad"; break;
            case "vai dormir": this.spiritState="Angry"; break;
            default: this.spiritState = "Neutro"; break;
        }


//        if(action.equals("carinho")){
//            this.spiritState = "Happy";
//        }else{
//            this.spiritState= "Sad";
//        }
        return this.spiritState;
    }

    @Override
    public String toString() {
        return "Dogs{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("Au AU");
    }
}
