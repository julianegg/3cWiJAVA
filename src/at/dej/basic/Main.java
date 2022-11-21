package at.dej.basic;

public class Main {
    public static void main(String[] args){

        int a = 7;

    Car c1 = new Car();
    c1.color = "blue";
    c1.fuelConsumption = 6;
    c1.serialNumber= "B123";
    c1.fuelAmount = 90;




    Car c2 = new Car();
        c2.color = "blue";
        c2.fuelConsumption = 9;
        c2.serialNumber= "M123";
        c2.fuelAmount = 80;



        System.out.println(c2.fuelAmount);
        c2.drive();
        System.out.println(c2.fuelAmount);
    }
}
