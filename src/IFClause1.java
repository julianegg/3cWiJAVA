import java.util.Random;

public class IFClause1 {
    public static void main(String[] args) {
        Random random = new Random();

        int randomNumber = random.nextInt(100);
        int randomNumber1 = random.nextInt(100);

        System.out.println(randomNumber);
        System.out.println(randomNumber1);


        if (randomNumber < randomNumber1 && randomNumber < 50) {
            System.out.println("Zahl 1 ist kleiner als Zahl 2 und Mini");
        } else if ((randomNumber < 30) || (randomNumber1 < 30)) {
            System.out.println("Eine der beiden ist kleiner als 30");
        } else if ((randomNumber < 50) && (randomNumber1 != 50)) {
            System.out.println("Erste Zahl klein, zweite kein 50iger");
        } else {
            System.out.println("keines trifft zu");
        }
    }
}
