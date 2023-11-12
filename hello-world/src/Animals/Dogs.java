package Animals;

public class Dogs {
    //ATRIBUTOS
    private String name;
    private String color;
    private int height;
    private double peso;
    private String spiritState;

    //CONSTRUTORES
    public Dogs(){}
    public Dogs(String name, String color, int height, double peso, String spiritState){
        this.name = name;
        this.color = color;
        this.height= height;
        this.peso = peso;
        this.spiritState = spiritState;
    }


    //METODOS
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

}
