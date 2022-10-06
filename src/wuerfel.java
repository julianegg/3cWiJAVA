import java.util.Random;

public class wuerfel {
    public static void main(String[] args) {
        Random random = new Random();
        int playerWins= 0;
        int compiWins = 0;
        int unentschieden = 0;
        for (int i = 0; i < 6; i++) {
            int randomComputer = random.nextInt(1, 6);
            int randomPlayer = random.nextInt(1, 6);
            System.out.println(randomComputer + "Compi:" + randomPlayer + "Player");

            if (randomComputer > randomPlayer) {
                System.out.println("Sieg für Compi" + randomComputer);
            } else if (randomComputer < randomPlayer) {
                System.out.println("Sieg für Player" + randomPlayer);

            } else {
                System.out.println("Unentschieden");
            }


        }


    }
}