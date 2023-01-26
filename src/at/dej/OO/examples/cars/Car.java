package at.dej.OO.examples.cars;

public class Car {
    private String brand;

    private String color;

    private int basicPrice;

    private int maxSpeed;

    private int basicConsumption;

    private producer producer;


    public Car(String brand, String color, int basicPrice, int maxSpeed, int basicConsumption, producer producer) {
        this.brand = brand;
        this.color = color;
        this.basicPrice = basicPrice;
        this.maxSpeed = maxSpeed;
        this.basicConsumption = basicConsumption;
        this.producer = producer;



    }

    public Car(int basicPrice) {
        this.basicPrice = basicPrice;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBasicPrice() {
        return basicPrice;
    }

    public void setBasicPrice(int basicPrice) {
        this.basicPrice = basicPrice;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getBasicConsumption() {
        return basicConsumption;
    }

    public void setBasicConsumption(int basicConsumption) {
        this.basicConsumption = basicConsumption;
    }






}
