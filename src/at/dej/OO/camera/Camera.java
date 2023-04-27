package at.dej.OO.camera;

public class Camera {
    private double pixel;
    private double weight;
    private String color;
    private Lens lens;
    private SDCard sdCard;
    private Producer producer;

    public Camera(double pixel, double weight, String color, Lens lens, SDCard sdCard, Producer producer) {
        this.pixel = pixel;
        this.weight = weight;
        this.color = color;
        this.lens = lens;
        this.sdCard = sdCard;
        this.producer = producer;
    }



}


