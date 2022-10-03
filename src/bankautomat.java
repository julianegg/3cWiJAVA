import java.util.Random;
import java.util.Scanner;

public class bankautomat {
    public static void main(String[] args) {
        int balance = 0;
        boolean isFinished = false;

        while (isFinished == false) {

            System.out.println("Gewünschte Funktion auswählen");
            System.out.println("1.Einzahlen");
            System.out.println("2.Abheben");
            System.out.println("3.Kontostand");
            System.out.println("4.Ende");
            Scanner scanner = new Scanner(System.in);
            int selection = scanner.nextInt();

            if (selection == 1) {
                System.out.println("Geben sie den Betrsg ein den Sie einzahlen möchten");

                int einzahlen = scanner.nextInt();
                System.out.println("Sie haben" + einzahlen + "eingezahlt");
                balance = balance + einzahlen;
            } else if (selection == 2){
                System.out.println("Geben sie den Betrsg ein den Sie abheben möchten");


                int amountToWithdraw = scanner.nextInt();
                balance = balance - amountToWithdraw;
                System.out.println("Sie haben" + amountToWithdraw + "abgehoben");
            } else if (selection == 3) {
                System.out.println(" Ihr Kontostand beträgt" + balance + "Euro");
            } else if (selection == 4){
                System.out.println("Ende");
                isFinished = true;
            }



        }
    }
}
