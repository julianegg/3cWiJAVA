package at.dej.OO.mobilephone;

public class Phone {
    private Sim sim;
    private Camera cam;
    private SDCard card;

    public Phone(Sim sim, Camera cam, SDCard card) {
        this.sim = sim;
        this.cam = cam;
        this.card = card;
    }
}
