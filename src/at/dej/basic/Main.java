package at.dej.basic;

public class Main {
    public static void main(String[] args) {

        int a = 7;

        Car c1 = new Car(5,"Ferrari","123");
        c1.setColor("blue");


        c1.turboBoost();
        c1.honk();
        c1.getRemainingRange();
        System.out.println(c1.getBrand());



//        Car c2 = new Car();
//        c2.color = "red";
//        c2.fuelConsumption = 9;
//        c2.serialNumber = "B1234";
//        c2.fuelAmount = 25;
//        c2.fuelVolume = 60;
//        c2.brand = "mercedes";
//
//
//        Car c3 = new Car( 17,"Opel1", "12345");
//        System.out.println(c3.serialNumber);




    }
}
