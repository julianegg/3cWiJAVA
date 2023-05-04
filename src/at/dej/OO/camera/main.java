package at.dej.OO.camera;

public class main {
    public static void main(String[] args) {


    Producer producer = new Producer("drisssnerCompany","turkey");
    SDCard card = new SDCard(23);
    Lens lens = new Lens( producer, 2);
    Camera cam = new Camera(13,5,"blue", lens, card,producer );
    Files files = new Files("hallo",)






    }
}