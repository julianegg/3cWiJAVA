package at.dej.OO.camera;

public class Lens extends Producer{
    public Lens(String name, String country, int focalLenght) {
        super(name, country);
        this.focalLenght = focalLenght;
    }
    private int focalLenght;
}
