package at.dej.OO.examples.cars;

public class Car {
    private String brand;

    private String color;

    private int basicPrice;

    private int maxSpeed;

    private double fuelConsumption;

    private producer producer;
    private double carPrice;

    private double kmStood;



    public Car(String brand, String color, int basicPrice, int maxSpeed, double fuelConsumption, producer producer, double kmStood) {
        this.brand = brand;
        this.color = color;
        this.basicPrice = basicPrice;
        this.maxSpeed = maxSpeed;
        this.fuelConsumption = fuelConsumption;
        this.producer = producer;
        this.kmStood = kmStood;
    }
    public double carPrice(){
        this.producer.getDiscount();
        double carPrice = this.basicPrice - this.basicPrice/ 100 * this.producer.getDiscount();
        return carPrice;
    }



    public Car(int basicPrice) {
        this.basicPrice = basicPrice;

    }

    public double drive() {
        kmStood = kmStood + 25000;
        return kmStood;
    }

    public double CarConsumption(){
    if(kmStood > 50000){
        this.fuelConsumption = this.fuelConsumption * 1.098;
    }
    else{
        this.fuelConsumption = this.fuelConsumption;

    }
        return fuelConsumption;
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

    public double getFuelConsumptionConsumption() {
        return fuelConsumption;
    }

    public void setBasicConsumption(int basicConsumption) {
        this.fuelConsumption = fuelConsumption;
    }


    public double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public at.dej.OO.examples.cars.producer getProducer() {
        return producer;
    }

    public void setProducer(at.dej.OO.examples.cars.producer producer) {
        this.producer = producer;
    }

    public double getKmStood() {
        return kmStood;
    }

    public void setKmStood(double kmStood) {
        this.kmStood = kmStood;
    }
}
