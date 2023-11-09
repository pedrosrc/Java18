import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import  java.util.Locale;

public class Main {

    public static void lace(String[] args) {

        String name = "Dav";
        LocalDate time = LocalDate.now();
        Locale country = new Locale("pt", "BR");
        String dayofweek = time.getDayOfWeek().getDisplayName(TextStyle.FULL, country);
        LocalDateTime hournow = LocalDateTime.now();

        System.out.printf("Hello, i'm %s. and now is %s, in day: %s.", name, hournow.getHour(), dayofweek);
    }

    public static void ma(String[] args){
        int index = 5;
        for(int i = 1; i<=10;i++){
            System.out.println(index + "x" + i + "=" + index * i);
        }
//        for(int i=1; i <=10; i++){
//            for(int j = 1; j <=10; j++){
//                System.out.println(i + "x" + j +"=" + i*j);
//            }
//        }
    }

    public static void main(String[] args){
        int[] numbers = {25,1,3,5,7};
        int maior = numbers[0];
        int menor = numbers[0];

        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] > maior){
                maior = numbers[i];
            }
        }
        System.out.println(maior);
    }
}