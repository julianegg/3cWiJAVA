package at.dej.OO.mobilephone;

public class Main {
    public static void main(String[] args) {

        Sim sim = new Sim(1,"06508040");
        SDCard card = new SDCard(5000);
        Camera cam = new Camera();

        Phone phone = new Phone(sim, cam, card );


    }
}
