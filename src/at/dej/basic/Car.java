package at.dej.basic;

public class Car {

    public String color;
    public String serialNumber;
    public double fuelConsumption;
    public double fuelAmount;
    public int speed;

    public int fuelVolume;

    public int valueOfFuel;

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
}
