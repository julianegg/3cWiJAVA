package at.dej.basic;

public class Car {

    private Engine engine;
    public boolean setSerialNumber;
    private String color;
    private String serialNumber;
    private double fuelConsumption;
    private double fuelAmount;
    private int speed;
    private String brand;
    private int fuelVolume;

    private int valueOfFuel;


    public Car(Engine engine, double fuelConsumption, String brand, String serialNumber) {
        this.fuelConsumption = fuelConsumption;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.engine = engine;
        System.out.println("ich bin" + this.brand + "und habe die Farbe" + this.color + "und habe" + this.getEngine().getHorsePower() + " ps");
    }


    public void doBreak() {
        this.speed = 0;
        System.out.println(speed + "km/h");
        System.out.println("i am break ");

    }


    public void drive() {
        this.speed = 100;
        this.fuelAmount = this.fuelAmount - this.fuelConsumption;
        System.out.println(speed + "km/h");
        System.out.println("I am driving");

    }

    public void turboBoost() {
        int fillStand = (int) (fuelAmount / fuelVolume * 100.0);

        if (fillStand >
                10) {
            System.out.println("Superboost");

        } else {
            System.out.println("Not enough fuel to go to Superboost");
        }
    }

    public void honk() {
        int amountOfRepetitions = 2;
        System.out.println("Tuuut" + "");

    }


    public void getRemainingRange() {
        double getRemainingRange = (fuelAmount - fuelConsumption);
        System.out.println(getRemainingRange + "Rest-Reichweite");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getFuelVolume() {
        return fuelVolume;
    }

    public void setFuelVolume(int fuelVolume) {
        this.fuelVolume = fuelVolume;
    }

    public int getValueOfFuel() {
        return valueOfFuel;
    }

    public void setValueOfFuel(int valueOfFuel) {
        this.valueOfFuel = valueOfFuel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
