package at.dej.OO.camera;

public class Lens{
    private Producer producer;
    private int focalLenght;

    public Lens(Producer producer, int focalLenght) {
        this.producer = producer;
        this.focalLenght = focalLenght;
    }
}
