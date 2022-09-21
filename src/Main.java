import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        Random random = new Random();

        int randomNumber = random.nextInt(100);

        if (randomNumber <= 20) {
            System.out.println("Mini");
        } else if (randomNumber > 20 && randomNumber < 50) {
            System.out.println("Medi");
        } else {
            System.out.println("Max");
        }
    }
}