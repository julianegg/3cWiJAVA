package at.dej.begin;

import java.util.Random;

public class IfClause2 {
    public static void main(String[] args) {
        Random random = new Random();

        int randomNumber = random.nextInt(100);

        if (randomNumber <= 20) {
            System.out.println("Mini");
        } else if (randomNumber > 20 && randomNumber < 50) {
            System.out.println("Medium");
        } else {
            System.out.println("Max");
        }
    }
}
