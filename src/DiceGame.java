import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {
        Random random = new Random();
        int playerWins = 0;
        int compiWins = 0;
        int unentschieden = 0;

        int countOfGames = 0;

        for (int i = 0; i < 6; i++) {
            int randomComputer = random.nextInt(1, 6);
            int randomPlayer = random.nextInt(1, 6);
            System.out.println(randomComputer + "Compi:" + randomPlayer + "Player");

            if (randomComputer > randomPlayer) {

                compiWins = compiWins + 1;
            } else if (randomComputer < randomPlayer) {

                playerWins = playerWins + 1;

            } else {

                unentschieden = unentschieden + 1;
            }


        }

        System.out.println(unentschieden + "unentschieden:" + compiWins + "compi:" + playerWins + "player");

    }
}
